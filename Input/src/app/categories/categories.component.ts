import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  news: any;
  inputvalue: any;

  constructor(public http : HttpClient) { 
    this.getNews();
  }

  ngOnInit() {
  }
  getCategories(event){
    this.inputvalue=event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=8d7348ecfa5641bdbc40a172f1b679ee&category='+ this.inputvalue)
    .subscribe(data=>{
      console.log(data);
      this.news = data.articles;
    });
  }
  getNews() {
    this .http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=business&apiKey=8d7348ecfa5641bdbc40a172f1b679ee').subscribe
        (data=>{
      console.log(data);
      this.news =data.articles;
    });
}
}
