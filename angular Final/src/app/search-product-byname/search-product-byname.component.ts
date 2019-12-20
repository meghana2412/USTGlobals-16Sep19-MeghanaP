import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-search-product-byname',
  templateUrl: './search-product-byname.component.html',
  styleUrls: ['./search-product-byname.component.css']
})
export class SearchProductBynameComponent implements OnInit {
  product: any;

  constructor(private productService: ProductService) { }

  searchProducByName(form: NgForm) {
    this.productService.searchProductByName(form.value).subscribe(responseData => {
      console.log(responseData);
      this.product = responseData.product;
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('product Data got successfully');
    });
  }

  searchProductByCompany(form: NgForm) {
    this.productService.searchProductByCompany(form.value).subscribe(responseData => {
      console.log(responseData);
      this.product = responseData.product;
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('product Data got successfully');
    });
  }

  searchProductByCategory(form: NgForm) {
    this.productService.searchProductByCategory(form.value).subscribe(responseData => {
      console.log(responseData);
      this.product = responseData.product;
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('product Data got successfully');
    });
  }

  ngOnInit() {
  }

}
