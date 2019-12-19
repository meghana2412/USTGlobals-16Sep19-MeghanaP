import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchbook',
  templateUrl: './searchbook.component.html',
  styleUrls: ['./searchbook.component.css']
})
export class SearchbookComponent implements OnInit {

  books: any[];
  constructor(private service: StudentService) {
  }

  searchBook(form: NgForm) {
    this.service.searchBookByName(form.value).subscribe(responseData => {
      console.log(responseData);
      this.books = responseData.bookBean;
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('Books responseData got successfully');
    });
  }
  ngOnInit() {
  }

}
