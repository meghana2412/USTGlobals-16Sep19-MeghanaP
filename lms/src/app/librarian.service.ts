import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LibrarianService {

  constructor(private http: HttpClient) { }

  addbook(book): Observable<any> {
    return this.http.post(`http://localhost:8081/librarymanagementsystem/add-books`, book);
  }
  updatebook(book): Observable<any> {
    return this.http.put(`http://localhost:8081/librarymanagementsystem/update-books`, book);
  }
  removeBook(book): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/delete-books/${book.bookId}`);
  }
  showAllBooks() {
    return this.http.get<any>(`http://localhost:8081/librarymanagementsystem/search-books`);
  }
  showAllRequest(): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/show-allRequest`);
  }
  showAllIssuedBooks(): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/show-allIssued-books`);
  }
  acceptRequest(book): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/accept-request/${book.regestrationId}`);

  }
  issueBooks(book): Observable<any> {
    return this.http.get(`http://localhost:8081/librarymanagementsystem/issue-book/${book.regestrationId}/${book.bookId}`);

  }
}
