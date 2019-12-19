import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http: HttpClient) { }

  addStudent(user): Observable<any> {
    return this.http.post(`http://localhost:8081/librarymanagementsystem/regester-user`, user);
  }
  addLibrarian(user): Observable<any> {
    return this.http.post(`http://localhost:8081/librarymanagementsystem/regester-user`, user);
  }
  removeStudent(user): Observable<any> {
    return this.http.delete(`http://localhost:8081/librarymanagementsystem/delete-user/${user.userID}`);
  }
  removeLibrarian(user): Observable<any> {
    return this.http.delete(`http://localhost:8081/librarymanagementsystem/delete-user/${user.userID}`);
  }
  updateStudent(user): Observable<any> {
    return this.http.put(`http://localhost:8081/librarymanagementsystem/update-student`, user);
  }
  updateLibrarian(user): Observable<any> {
    return this.http.put(`http://localhost:8081/librarymanagementsystem/update-librarian`, user);
  }
  searchAllUsers(): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/get-allUsers`);
  }
  searchUserById(user): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/get-user/${user.userID}`);
  }
}
