import { Component } from '@angular/core';
import { ProductService } from '../services/product.service';
import { Product } from '../model/Product';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-fetchallproducts',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './fetchallproducts.component.html',
  styleUrl: './fetchallproducts.component.css'
})
export class FetchallproductsComponent {

   products:any

   constructor(private productService:ProductService) {
   }

   ngOnInit() {
    console.log("inside fetchallproducts");
    this.productService.getAllProducts().subscribe(data=> this.products = data);
   }
}
