import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }

  searchProductByName(product): Observable<any> {
    return this.http.get (`http://localhost:3306/stock-management/search-byName/${product.name}`);
  }

  searchProductByCompany(product): Observable<any> {
    return this.http.get (`http://localhost:3306/stock-management/search-byCompany/${product.company}`);
  }

  searchProductByCategory(product): Observable<any> {
    return this.http.get (`http://localhost:3306/stockmanagement/search-byCategory/${product.category}`);
  }



  addProduct(product): Observable<any> {
    return this.http.post (`http://localhost:3306/stockmanagement/add-product`, product);
  }



  updateProduct(product): Observable<any> {
    return this.http.put(`http://localhost:3306/stockmanagement/modify-product`, product);
  }

  getAllProduct(product): Observable<any> {
    return this.http.get(`http://localhost:3306/stockmanagement/get-Allproduct/${product.category}`);
  }


}
