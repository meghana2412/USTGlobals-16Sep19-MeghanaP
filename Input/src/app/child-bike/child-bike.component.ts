import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-bike',
  templateUrl: './child-bike.component.html',
  styleUrls: ['./child-bike.component.css']
})
export class ChildBikeComponent implements OnInit {
  @Input() bike: {imgUrl : string, name : string}

  constructor() { }

  ngOnInit() {
  }

}
