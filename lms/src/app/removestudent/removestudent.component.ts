import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-removestudent',
  templateUrl: './removestudent.component.html',
  styleUrls: ['./removestudent.component.css']
})
export class RemovestudentComponent implements OnInit {

  msg: string;
  constructor(private adminService: AdminService, private router: Router) { }

  deleteStudent(form: NgForm) {
    this.msg = null;
    this.adminService.removeStudent(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Removed Student', responseData);
        if (responseData && responseData.description === 'Student Data Removed from the DataBase') {
          this.router.navigateByUrl('/admin');
        } else {
          this.router.navigateByUrl('/removestudent');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.description;
      });
  }
  ngOnInit(): void {
  }
}
