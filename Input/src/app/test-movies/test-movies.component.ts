import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-test-movies',
  templateUrl: './test-movies.component.html',
  styleUrls: ['./test-movies.component.css']
})
export class TestMoviesComponent implements OnInit {
  inputvalue: any;
   movies: any;
  constructor(private http : HttpClient) { }

  ngOnInit() {
  }
  search(event){
    this.inputvalue=event.target.value;
    this.http.get<any>('http://www.omdbapi.com/?apikey=1fb6c68c&s='+ this.inputvalue)
    .subscribe(data=>{
      console.log(data);
      this.movies = data.Search;
});
  }
}0
