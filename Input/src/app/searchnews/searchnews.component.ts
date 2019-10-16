import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-searchnews',
  templateUrl: './searchnews.component.html',
  styleUrls: ['./searchnews.component.css']
})
export class SearchnewsComponent implements OnInit {
  inputvalue: any;
  news: any;

  constructor(public http : HttpClient) { }

  ngOnInit() {
  }
  search(event){
    this.inputvalue=event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=8d7348ecfa5641bdbc40a172f1b679ee&q='+ this.inputvalue)
    .subscribe(data=>{
      console.log(data);
      this.news = data.articles;
    });
  }
}
