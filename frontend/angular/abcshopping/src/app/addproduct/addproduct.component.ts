import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-addproduct',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent {

  constructor(private productService:ProductService) {

  }

  saveProduct(addProductForm:any) {
    console.log(addProductForm.value);
    this.productService.addNewProduct(addProductForm.value)
    .subscribe(()=>alert("Product Saved!"));

  }
}
