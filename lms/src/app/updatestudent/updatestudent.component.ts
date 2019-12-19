import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-updatestudent',
  templateUrl: './updatestudent.component.html',
  styleUrls: ['./updatestudent.component.css']
})
export class UpdatestudentComponent implements OnInit {
  msg: string;
  constructor(private adminService: AdminService, private router: Router) { }

  update_student(form: NgForm) {
    this.msg = null;
    this.adminService.updateStudent(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Updated Student', responseData);
        if (responseData && responseData.message === 'success') {
          this.router.navigateByUrl('/admin');
        } else {
          this.router.navigateByUrl('/updatestudent');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.responseData.description;
      });

  }
  ngOnInit() {
  }

}
