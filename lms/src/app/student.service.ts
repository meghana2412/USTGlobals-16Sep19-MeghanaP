import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) { }
  searchBookByName(book): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/get-book/${book.bookTitle}`);
  }

  showAllBooks(): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/get-allBooks`);
  }

  requestBooks(book): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/request-book/${book.userID}/${book.bookId}`);
  }

  cancelBookRequest(book): Observable<any> {
    return this.http.delete(`http://localhost:8081/librarymanagementsystem/cancel-request/${book.regestrationId}/${book.userID}`);
  }
}
