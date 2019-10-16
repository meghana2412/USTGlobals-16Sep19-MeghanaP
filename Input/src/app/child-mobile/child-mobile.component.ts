import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-mobile',
  templateUrl: './child-mobile.component.html',
  styleUrls: ['./child-mobile.component.css']
})
export class ChildMobileComponent implements OnInit {
  @Input()mobile;
  constructor() { }

  ngOnInit() {
  }

}
