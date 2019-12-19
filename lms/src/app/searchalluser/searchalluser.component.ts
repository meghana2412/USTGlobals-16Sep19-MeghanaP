import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-searchalluser',
  templateUrl: './searchalluser.component.html',
  styleUrls: ['./searchalluser.component.css']
})
export class SearchalluserComponent implements OnInit {

  users: any[];
  constructor(private service: AdminService) {
    this.searchAllUsers();
  }

  searchAllUsers() {
    this.service.searchAllUsers().subscribe(Data => {
      console.log(Data);
      this.users = Data.userBean;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Users got successfully');
    });
  }
  ngOnInit() {
  }

}
