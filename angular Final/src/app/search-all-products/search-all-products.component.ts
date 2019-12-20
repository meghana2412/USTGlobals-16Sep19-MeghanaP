import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search-all-products',
  templateUrl: './search-all-products.component.html',
  styleUrls: ['./search-all-products.component.css']
})
export class SearchAllProductsComponent implements OnInit {
  product: any;

  constructor(private productService: ProductService ) {
    this.getAllProduct();
  }

  getAllProduct() {
    this.productService.getAllProduct(this.product).subscribe(responseData => {
      console.log(responseData);
      this.product = responseData.product;
    }, err => {
      console.log(err);
    }, () => {
      console.log('All Products got successfully');
    });
  }

  ngOnInit() {
  }

}
