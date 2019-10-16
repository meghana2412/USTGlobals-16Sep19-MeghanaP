import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  Movies = [{
    imgUrl : 'https://cdn.pixabay.com/photo/2018/04/10/22/18/spiderman-3309033__340.jpg',
    name : 'Spider Man',
    description: 'Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books.',
    ratings : 'Rating:9/10'
   },
   {
    imgUrl : 'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
    name : 'Iron Man',
    description : 'When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.',
    ratings : 'Rating:9/10'
   } , {
    imgUrl : 'https://cdn.pixabay.com/photo/2017/07/14/12/58/superhero-2503808__340.jpg',
    name : 'Super Man',
    description : 'Superman is a fictional superhero. The character was created by writer Jerry Siegel and artist Joe Shuster, and first appeared in Action Comics #1, a comic book published on April 18, 1938.',
    ratings: 'Ratings:8/10'
   }, {
    imgUrl : 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
    name : 'Avengers',
    description : 'Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with',
    ratings : 'Ratings:10/10'
    
   }
 ];
 selectedMovie: any;

  constructor() { }

  ngOnInit() {
  }
  sendMovie(movies){
    console.log(movies);
    this.selectedMovie = movies;

  }
}
