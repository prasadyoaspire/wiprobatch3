import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { ProductService } from '../services/product.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-editproduct',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './editproduct.component.html',
  styleUrl: './editproduct.component.css'
})
export class EditproductComponent {

  // productForm = new FormGroup({
  //   id: new FormControl(''),
  //   productName : new FormControl(''),
  //   productPrice : new FormControl(''),
  //   mfd: new FormControl(''),
  //   category : new FormControl('')
  // })

  isDisabled : boolean = true

  productForm : FormGroup;

  constructor(private formBuilder:FormBuilder,private productService: ProductService, private route:ActivatedRoute) {
    this.productForm = this.formBuilder.group({
      id:[''],
      productName:[''],
      productPrice:[''],
      mfd:[''],
      category:['']
    })
  }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      let productId: number = Number(params.get("pid"));
      this.fetchProductDetails(productId);
    })
  }

  fetchProductDetails(id: number) {
    this.productService.getProductDetails(id).subscribe({
      next: data => this.productForm.setValue(data),
      error: err => console.log(err)
    })
  } 

  updateProduct() {
    console.log(this.productForm.value);
    const existingProduct = this.productForm.value;
    this.productService.updateProduct(existingProduct).subscribe(()=>alert("Updated"));

  }
}
