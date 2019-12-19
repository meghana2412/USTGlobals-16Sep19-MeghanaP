import { Component, OnInit } from '@angular/core';
import { LibrarianService } from '../librarian.service';

@Component({
  selector: 'app-showallrequests',
  templateUrl: './showallrequests.component.html',
  styleUrls: ['./showallrequests.component.css']
})
export class ShowallrequestsComponent implements OnInit {

  requests: any[];
  constructor(private service: LibrarianService) {
    this.showAllRequest();
  }

  showAllRequest() {
    this.service.showAllRequest().subscribe(responseData => {
      console.log(responseData);
      this.requests = responseData.bookRegestrationBean;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Request  got successfully');
    });
  }
  ngOnInit() {
  }

}
