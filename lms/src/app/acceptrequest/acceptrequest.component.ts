import { Component, OnInit } from '@angular/core';
import { LibrarianService } from '../librarian.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-acceptrequest',
  templateUrl: './acceptrequest.component.html',
  styleUrls: ['./acceptrequest.component.css']
})
export class AcceptrequestComponent implements OnInit {

  msg: string;
  constructor(private service: LibrarianService, private router: Router) { }

  acceptBookRequest(form: NgForm) {
    this.msg = null;
    this.service.acceptRequest(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Request Book', responseData);
        if (responseData && responseData.description === 'Requesting for Book is Accepted') {
          this.router.navigateByUrl('/librarian');
        } else {
          this.router.navigateByUrl('/acceptrequest');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.description;
      });
  }

  ngOnInit() {
  }

}
