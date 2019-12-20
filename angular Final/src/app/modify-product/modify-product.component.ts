import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-modify-product',
  templateUrl: './modify-product.component.html',
  styleUrls: ['./modify-product.component.css']
})
export class ModifyProductComponent implements OnInit {
  msg: string;
  constructor(private productService: ProductService, private router: Router) { }

  updateProduct(form: NgForm) {
    this.msg = null;
    this.productService.updateProduct(form.value)
      .subscribe(responseData => {
        this.msg = responseData.description;
        console.log('Response of Updated product', responseData);
        if (responseData && responseData.message === 'success') {
          this.router.navigateByUrl('/modify-product');

        } else {
          this.router.navigateByUrl('/modify-product');
        }
        form.reset();
      }, err => {
        console.log(err);
        this.msg = err.responseData.description;
      });
  }

  ngOnInit() {
  }

}
