import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatelibrarian',
  templateUrl: './updatelibrarian.component.html',
  styleUrls: ['./updatelibrarian.component.css']
})
export class UpdatelibrarianComponent {

  msg: string;
  constructor(private adminService: AdminService, private router: Router) { }

  update_librarian(form: NgForm) {
    this.msg = null;
    this.adminService.updateLibrarian(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Updated Librarian', responseData);
        if (responseData && responseData.message === 'success') {
          this.router.navigateByUrl('/admin');
        } else {
          this.router.navigateByUrl('/updatelibrarian');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.responseData.description;
      });
  }
}
