import { Component } from '@angular/core';
import { ProductService } from '../services/product.service';
import { Product } from '../model/Product';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { MatTableModule } from '@angular/material/table';


@Component({
  selector: 'app-fetchallproducts',
  standalone: true,
  imports: [CommonModule,RouterLink, MatTableModule],
  templateUrl: './fetchallproducts.component.html',
  styleUrl: './fetchallproducts.component.css'
})
export class FetchallproductsComponent {

   products:any

   displayedColumns: string[] = ['id', 'productName', 'productPrice'];

   constructor(private productService:ProductService) {
   }

   ngOnInit() {
    console.log("inside fetchallproducts");
    this.productService.getAllProducts().subscribe((data)=> this.products = data);
   }
}
