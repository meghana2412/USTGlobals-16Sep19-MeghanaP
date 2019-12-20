import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
 msg: string;
  constructor( private productService: ProductService, private router: Router) { }

  ngOnInit() {
  }
  addProduct(form: NgForm) {
    this.msg = null;
    this.productService.addProduct(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Add product', responseData);
        if (responseData && responseData.message === 'success') {
          this.router.navigateByUrl('/add-product');

        } else {
          this.router.navigateByUrl('/add-product');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.description;
      });
  }

}
