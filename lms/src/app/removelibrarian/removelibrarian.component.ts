import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-removelibrarian',
  templateUrl: './removelibrarian.component.html',
  styleUrls: ['./removelibrarian.component.css']
})
export class RemovelibrarianComponent implements OnInit {


  msg: string;
  constructor(private adminService: AdminService, private router: Router) { }

  deleteLibrarian(form: NgForm) {
    this.msg = null;
    this.adminService.removeLibrarian(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Removed Librarian', responseData);
        if (responseData && responseData.description === 'Librarian Data Removed from the DataBase') {
          this.router.navigateByUrl('/admin');
        } else {
          this.router.navigateByUrl('/removelibrarian');
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
