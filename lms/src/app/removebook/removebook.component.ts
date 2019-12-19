import { Component, OnInit } from '@angular/core';
import { LibrarianService } from '../librarian.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-removebook',
  templateUrl: './removebook.component.html',
  styleUrls: ['./removebook.component.css']
})
export class RemovebookComponent implements OnInit {


  msg: string;
  constructor(private service: LibrarianService, private router: Router) { }

  deleteBook(form: NgForm) {
    this.msg = null;
    this.service.removeBook(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Removed Book', responseData);
        if (responseData && responseData.description === 'Book Removed from the DataBase') {
          this.router.navigateByUrl('/librarian');
        } else {
          this.router.navigateByUrl('/removebook');
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
