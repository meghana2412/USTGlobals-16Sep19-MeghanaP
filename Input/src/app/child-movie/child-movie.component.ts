import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-movie',
  templateUrl: './child-movie.component.html',
  styleUrls: ['./child-movie.component.css']
})
export class ChildMovieComponent implements OnInit {
  @Input()movies;

  constructor() { }

  ngOnInit() {
  }

}
