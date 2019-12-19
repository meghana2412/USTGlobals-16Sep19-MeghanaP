import { Component, OnInit } from '@angular/core';
import { LibrarianService } from '../librarian.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-issuebook',
  templateUrl: './issuebook.component.html',
  styleUrls: ['./issuebook.component.css']
})
export class IssuebookComponent implements OnInit {

  msg: string;
  constructor(private service: LibrarianService, private router: Router) { }

  issueBook(form: NgForm) {
    this.msg = null;
    this.service.issueBooks(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Issued Book', responseData);
        if (responseData && responseData.description === 'Book is Issued Successfully') {
          this.router.navigateByUrl('/librarian');
        } else {
          this.router.navigateByUrl('/issuebook');
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
