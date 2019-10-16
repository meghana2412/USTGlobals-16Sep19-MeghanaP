import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
  news: any;
  inputData: any;

  constructor(public http : HttpClient) { 
    this.getNews();
  }

  ngOnInit() {
  }

  getCountries(event){
    this.inputData=event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=8d7348ecfa5641bdbc40a172f1b679ee&country='+ this.inputData)
    .subscribe(data=>{
      console.log(data);
      this.news = data.articles;
    })
  }
  getNews() {
    this .http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=8d7348ecfa5641bdbc40a172f1b679ee').subscribe
        (data=>{
      console.log(data);
      this.news =data.articles;
    });
}
}
