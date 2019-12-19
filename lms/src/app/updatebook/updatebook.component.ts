import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LibrarianService } from '../librarian.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatebook',
  templateUrl: './updatebook.component.html',
  styleUrls: ['./updatebook.component.css']
})
export class UpdatebookComponent implements OnInit {
  constructor(private service: LibrarianService, private router: Router) { }


  msg: string;
  ngOnInit() {
  }


  updateBook(form: NgForm) {
    this.msg = null;
    this.service.updatebook(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Update Book', responseData);
        if (responseData && responseData.description === 'Book is updated to the Library') {
          this.router.navigateByUrl('/librarian');
        } else {
          this.router.navigateByUrl('/updatebook');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.description;
      });

  }


}
