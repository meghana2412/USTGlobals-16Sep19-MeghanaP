import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
  Mobiles = [{
    imgUrl : 'https://cdn.pixabay.com/photo/2015/05/12/09/13/social-media-763731__340.jpg',
    name : 'Mi',
    description: 'Redmi 4A X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    rupees : 'Rs: 18000'
   },
   {
    imgUrl : 'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg',
    name : 'iPhone',
    description : '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.',
    rupees : 'Rs: 75000 '
   } , {
    imgUrl : 'https://cdn.pixabay.com/photo/2014/08/05/10/27/iphone-410311__340.jpg',
    name : 'Samsung',
    description : 'Samsung s6 edge X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    rupees: 'Rs:25000'
   }, {
    imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png',
    name : 'Sony',
    description : 'Sony Xperia M2 X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    rupees : 'Rs:15000'
    
   }
 ];
 selectedMobile: any;

  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile){
    console.log(mobile);
    this.selectedMobile = mobile;

}

}
