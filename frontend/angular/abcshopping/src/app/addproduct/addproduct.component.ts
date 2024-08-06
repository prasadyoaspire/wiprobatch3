import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ProductService } from '../services/product.service';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-addproduct',
  standalone: true,
  imports: [FormsModule, MatFormFieldModule,MatInputModule,MatButtonModule],
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
