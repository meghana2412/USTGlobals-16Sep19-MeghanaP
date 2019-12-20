import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AddProductComponent } from './add-product/add-product.component';
import { ModifyProductComponent } from './modify-product/modify-product.component';
import { SearchProductBynameComponent } from './search-product-byname/search-product-byname.component';
import { SearchAllProductsComponent } from './search-all-products/search-all-products.component';


const routes: Routes = [
  { path : '', component: HomeComponent},
  { path : 'add-product', component: AddProductComponent},
  { path : 'modify-product', component: ModifyProductComponent},
  { path : 'name', component: SearchProductBynameComponent},
  { path : 'getAllProduct', component: SearchAllProductsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
