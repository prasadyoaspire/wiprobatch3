import { Routes } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { FetchallproductsComponent } from './fetchallproducts/fetchallproducts.component';
import { HomeComponent } from './home/home.component';

export const routes: Routes = [
    { path : '', component: HomeComponent},
    { path : 'product/add', component: AddproductComponent},
    { path : 'product/all', component: FetchallproductsComponent},
];
