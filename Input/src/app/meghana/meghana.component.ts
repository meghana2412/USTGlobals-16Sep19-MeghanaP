import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-meghana',
  templateUrl: './meghana.component.html',
  styleUrls: ['./meghana.component.css']
})
export class MeghanaComponent implements OnInit {
  news: any;
  tnews: any;
  snews: any;

  constructor(public http : HttpClient ) { 
    this.getNews();
    this. getTnews();
    this.getSnews();
  }

  ngOnInit() {
  }
  getNews() {
this .http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=8d7348ecfa5641bdbc40a172f1b679ee').subscribe
    (data=>{
  console.log(data);
  this.news =data.articles;
});
      }
      getTnews() {
        this .http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=8d7348ecfa5641bdbc40a172f1b679ee').subscribe
            (data=>{
          console.log(data);
          this.tnews =data.articles;
        });
  }
  getSnews() {
    this .http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=8d7348ecfa5641bdbc40a172f1b679ee').subscribe
  
        (data=>{
      console.log(data);
      this.snews =data.articles;
    });
}
}