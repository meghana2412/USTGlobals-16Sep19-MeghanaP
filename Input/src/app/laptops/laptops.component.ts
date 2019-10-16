import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  Laptops = [{
    imgUrl : 'https://cdn.pixabay.com/photo/2014/09/27/13/45/notebook-463490__340.jpg',
    name : 'Asus',
    description: 'ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    rupees : 'Rs: 50000'
   },
   {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/08/09/22/12/tablet-1581944__340.jpg',
    name : 'HP',
    description : 'HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.',
    rupees : 'Rs: 550000 '
   } , {
    imgUrl : 'https://cdn.pixabay.com/photo/2017/08/10/07/32/dell-2619501__340.jpg',
    name : 'Dell',
    description : 'Dell 15 7000 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.',
    rupees: 'Rs:45000'
   }, {
    imgUrl : 'https://image.shutterstock.com/image-illustration/3d-rendering-illustration-laptop-notebook-260nw-1103233229.jpg',
    name : 'Sony',
    description : 'Sony Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    rupees : 'Rs:60000'
    
   }
 ];
 selectedLaps: any;

  constructor() { }

  ngOnInit() {
  }
  sendLaps(laps){
    console.log(laps);
    this.selectedLaps = laps;

}

}

 
