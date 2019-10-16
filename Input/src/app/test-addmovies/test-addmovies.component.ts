import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators,  } from '@angular/forms';

@Component({
  selector: 'app-test-addmovies',
  templateUrl: './test-addmovies.component.html',
  styleUrls: ['./test-addmovies.component.css']
})
export class TestAddmoviesComponent implements OnInit {
    get movie() {
      return this.form.get('movie');
    }
    get title() {
         return this.form.get ('title');
       }
       get image() {
        return this.form.get('image');
      }
      get desc() {
           return this.form.get ('desc');
         }
   form = new  FormGroup({
        movie: new FormControl('', [Validators.required, ]),
        title: new FormControl( '', [Validators.required]),
        image: new FormControl('', [Validators.required, ]),
        desc: new FormControl( '', [Validators.required])
      }
    );
  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
    console.log(form)
  }

}

