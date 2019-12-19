import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchuser',
  templateUrl: './searchuser.component.html',
  styleUrls: ['./searchuser.component.css']
})
export class SearchuserComponent implements OnInit {

  users: any[];
  constructor(private service: AdminService) {
  }

  searchUser(form: NgForm) {
    this.service.searchUserById(form.value).subscribe(Data => {
      console.log(Data);
      this.users = Data.userBean;
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('User Data got successfully');
    });
  }
  ngOnInit() {
  }

}
