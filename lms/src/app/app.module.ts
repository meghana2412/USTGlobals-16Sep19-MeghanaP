import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AdminComponent } from './admin/admin.component';
import { StudentComponent } from './student/student.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { AddstudentComponent } from './addstudent/addstudent.component';
import { AddlibrarianComponent } from './addlibrarian/addlibrarian.component';
import { RemovestudentComponent } from './removestudent/removestudent.component';
import { RemovelibrarianComponent } from './removelibrarian/removelibrarian.component';
import { UpdatestudentComponent } from './updatestudent/updatestudent.component';
import { UpdatelibrarianComponent } from './updatelibrarian/updatelibrarian.component';
import { SearchuserComponent } from './searchuser/searchuser.component';
import { SearchalluserComponent } from './searchalluser/searchalluser.component';
import { SearchbookComponent } from './searchbook/searchbook.component';
import { SearchallbooksComponent } from './searchallbooks/searchallbooks.component';
import { RequestbookComponent } from './requestbook/requestbook.component';
import { CancelrequestComponent } from './cancelrequest/cancelrequest.component';
import { AddbookComponent } from './addbook/addbook.component';
import { RemovebookComponent } from './removebook/removebook.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { AcceptrequestComponent } from './acceptrequest/acceptrequest.component';
import { ShowallrequestsComponent } from './showallrequests/showallrequests.component';
import { ShowallissuedbooksComponent } from './showallissuedbooks/showallissuedbooks.component';
import { SearchbookbynameComponent } from './searchbookbyname/searchbookbyname.component';
import { SearchallbookbylibrarianComponent } from './searchallbookbylibrarian/searchallbookbylibrarian.component';
import { UpdatebookComponent } from './updatebook/updatebook.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    AdminComponent,
    StudentComponent,
    LibrarianComponent,
    AddstudentComponent,
    AddlibrarianComponent,
    RemovestudentComponent,
    RemovelibrarianComponent,
    UpdatestudentComponent,
    UpdatelibrarianComponent,
    SearchuserComponent,
    SearchalluserComponent,
    SearchbookComponent,
    SearchallbooksComponent,
    RequestbookComponent,
    CancelrequestComponent,
    AddbookComponent,
    RemovebookComponent,
    IssuebookComponent,
    AcceptrequestComponent,
    ShowallrequestsComponent,
    ShowallissuedbooksComponent,
    SearchbookbynameComponent,
    SearchallbookbylibrarianComponent,
    UpdatebookComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
