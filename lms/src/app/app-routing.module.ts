import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { StudentComponent } from './student/student.component';
import { LibrarianComponent } from './librarian/librarian.component';
import { RegisterComponent } from './register/register.component';
import { AuthGuard } from './auth.guard';
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
import { CancelrequestComponent } from './cancelrequest/cancelrequest.component';
import { RequestbookComponent } from './requestbook/requestbook.component';
import { AddbookComponent } from './addbook/addbook.component';
import { RemovebookComponent } from './removebook/removebook.component';
import { IssuebookComponent } from './issuebook/issuebook.component';
import { AcceptrequestComponent } from './acceptrequest/acceptrequest.component';
import { ShowallrequestsComponent } from './showallrequests/showallrequests.component';
import { ShowallissuedbooksComponent } from './showallissuedbooks/showallissuedbooks.component';
import { SearchbookbynameComponent } from './searchbookbyname/searchbookbyname.component';
import { SearchallbookbylibrarianComponent } from './searchallbookbylibrarian/searchallbookbylibrarian.component';
import { UpdatebookComponent } from './updatebook/updatebook.component';


const routes: Routes = [
  { path: '', component: HomeComponent },
  {
    path: 'admin', component: AdminComponent,
    canActivate: [AuthGuard], data: { userType: ['Admin'] }
  },
  {
    path: 'student', component: StudentComponent,
    canActivate: [AuthGuard], data: { userType: ['Student'] }
  },
  {
    path: 'librarian', component: LibrarianComponent,
    canActivate: [AuthGuard], data: { userType: ['Librarian'] }
  },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent ,
  canActivate: [AuthGuard], data: { userType: ['Admin'] }

    },
  { path: 'addstudent', component: AddstudentComponent },
  { path: 'addlibrarian', component: AddlibrarianComponent },
  { path: 'removestudent', component: RemovestudentComponent },
  { path: 'removelibrarian', component: RemovelibrarianComponent },
  { path: 'updatestudent', component: UpdatestudentComponent },
  { path: 'updatelibrarian', component: UpdatelibrarianComponent },
  { path: 'searchuser', component: SearchuserComponent },
  { path: 'searchalluser', component: SearchalluserComponent },
  { path: 'searchbook', component: SearchbookComponent },
  { path: 'searchallbooks', component: SearchallbooksComponent },
  { path: 'requestbook', component: RequestbookComponent },
  { path: 'cancelrequest', component: CancelrequestComponent },
  { path: 'addbook', component: AddbookComponent},
  { path: 'removebook', component : RemovebookComponent},
  { path: 'issuebook', component : IssuebookComponent},
  { path: 'acceptrequest', component : AcceptrequestComponent},
  { path: 'showallrequests', component : ShowallrequestsComponent},
  { path: 'showallissuedbooks', component : ShowallissuedbooksComponent},
  { path: 'searchbookbyname', component : SearchbookbynameComponent},
  { path: 'searchallbookbylibrarian', component : SearchallbookbylibrarianComponent},
  { path: 'updatebook', component : UpdatebookComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
