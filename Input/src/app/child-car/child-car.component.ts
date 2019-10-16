import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-car',
  templateUrl: './child-car.component.html',
  styleUrls: ['./child-car.component.css']
})
export class ChildCarComponent implements OnInit {
  @Input() car : {imgUrl : string, name : string}

  constructor() { }

  ngOnInit() {
  }

}
