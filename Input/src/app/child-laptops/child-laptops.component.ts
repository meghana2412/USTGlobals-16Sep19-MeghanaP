import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child-laptops',
  templateUrl: './child-laptops.component.html',
  styleUrls: ['./child-laptops.component.css']
})
export class ChildLaptopsComponent implements OnInit {
  @Input() laps;
  constructor() { }

  ngOnInit() {
  }

}
