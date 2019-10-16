import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  Bikes = [{
    imgUrl : 'https://cdn.pixabay.com/photo/2019/07/17/14/34/vespa-4344085__340.png',
    name : 'vespa',
    description: 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.',
    model : 'Model-2015'
   },
   {
    imgUrl : 'https://cdn.pixabay.com/photo/2019/09/23/08/01/traffic-4497805__340.jpg',
    name : 'Ducati',
    description : 'The Bugatti La Voiture Noire is a one-off supercar based on the Chiron. Unveiled at the 2019 Geneva Motor Show, it joins the Divo as a derivative from the already famous Chiron hypercar. The La Voiture Noire is a modern reinterpretation of the Type 57 SC Atlantic from the 1930s.',
    model : 'Model-2013'
   } , {
    imgUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
    name : 'Royal Enfield',
    description : 'The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.',
    model: 'Model-2019'
   }, {
    imgUrl : 'https://cdn.pixabay.com/photo/2019/09/23/01/09/motorcycle-4497320__340.jpg',
    name : 'BMW',
    description : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.',
    model : 'Model : 1945'
    
   }
 ];
 selectedBike: any;

  constructor() { }

  ngOnInit() {
  }
  sendBike(bike){
    console.log(bike);
    this.selectedBike = bike;

}

}
