import { Routes } from '@angular/router';
import { AddproductComponent } from './addproduct/addproduct.component';
import { FetchallproductsComponent } from './fetchallproducts/fetchallproducts.component';
import { HomeComponent } from './home/home.component';
import { FetchproductComponent } from './fetchproduct/fetchproduct.component';
import { EditproductComponent } from './editproduct/editproduct.component';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { AddcustomerComponent } from './customer/addcustomer/addcustomer.component';

export const routes: Routes = [
    { path : '', component: HomeComponent},
    { path : 'product/add', component: AddproductComponent},
    { path : 'product/all', component: FetchallproductsComponent},
    { path : 'product/get/:pid', component: FetchproductComponent},
    { path : 'product/edit/:pid', component: EditproductComponent},
    { path : 'pipedemos', component: PipedemoComponent},
    { path : 'customer/add', component: AddcustomerComponent},
];
