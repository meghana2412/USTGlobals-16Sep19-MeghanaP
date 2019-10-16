import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-source',
  templateUrl: './source.component.html',
  styleUrls: ['./source.component.css']
})
export class SourceComponent implements OnInit {
  news: any;
  inputvalue: any;

  constructor(public http : HttpClient) {
    this.getNews();
   }

  ngOnInit() {
  }
  getSources(event){
    this.inputvalue=event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=8d7348ecfa5641bdbc40a172f1b679ee&sources='+ this.inputvalue)
    .subscribe(data=>{
      console.log(data);
      this.news = data.articles;
    });
  }
  getNews() {
    this .http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=8d7348ecfa5641bdbc40a172f1b679ee').subscribe
        (data=>{
      console.log(data);
      this.news =data.articles;
    });
}
}
