import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { CarsComponent } from './cars/cars.component';
import { ChildCarComponent } from './child-car/child-car.component';
import { BikesComponent } from './bikes/bikes.component';
import { ChildBikeComponent } from './child-bike/child-bike.component';
import { MoviesComponent } from './movies/movies.component';
import { ChildMovieComponent } from './child-movie/child-movie.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { ChildLaptopsComponent } from './child-laptops/child-laptops.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { ChildMobileComponent } from './child-mobile/child-mobile.component';
import { HomeComponent } from './home/home.component';
import { NewHeaderComponent } from './new-header/new-header.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourceComponent } from './source/source.component';
import { SearchnewsComponent } from './searchnews/searchnews.component';
import { MeghanaComponent } from './meghana/meghana.component';
import { HttpClientModule } from '@angular/common/http';
import { TestHeaderComponent } from './test-header/test-header.component';
import { TestMoviesComponent } from './test-movies/test-movies.component';
import { TestAddmoviesComponent } from './test-addmovies/test-addmovies.component';
import { TestLoginComponent } from './test-login/test-login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CarsComponent,
    ChildCarComponent,
    BikesComponent,
    ChildBikeComponent,
    MoviesComponent,
    ChildMovieComponent,
    LaptopsComponent,
    ChildLaptopsComponent,
    MobilesComponent,
    ChildMobileComponent,
    HomeComponent,
    NewHeaderComponent,
    CountriesComponent,
    CategoriesComponent,
    SourceComponent,
    SearchnewsComponent,
    MeghanaComponent,
    TestHeaderComponent,
    TestMoviesComponent,
    TestAddmoviesComponent,
    TestLoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'cars', component : CarsComponent  },
      {path : 'bikes', component : BikesComponent},
      { path : 'movies', component : MoviesComponent},
      { path : 'laptops', component : LaptopsComponent},
      { path : 'home', component : HomeComponent},
      { path : 'mobiles', component : MobilesComponent},
      {path : 'countries', component : CountriesComponent},
      {path : 'categories',component: CategoriesComponent},
      {path : 'sources',component:SourceComponent},
      {path : 'searchnews',component:SearchnewsComponent},
      {path : 'meghana', component : MeghanaComponent},
      {path : 'testmovies', component : TestMoviesComponent},
      {path : 'addmovies', component : TestAddmoviesComponent},
      {path : 'login', component : TestLoginComponent }



    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
