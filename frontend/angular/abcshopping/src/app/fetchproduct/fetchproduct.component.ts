import { Component } from '@angular/core';
import { Product } from '../model/Product';
import { ProductService } from '../services/product.service';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-fetchproduct',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './fetchproduct.component.html',
  styleUrl: './fetchproduct.component.css'
})
export class FetchproductComponent {

  selectedProduct: any;

  constructor(private productService: ProductService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      let productId: number = Number(params.get("pid"));
      this.fetchProductDetails(productId);
    })
  }

  fetchProductDetails(id: number) {
    this.productService.getProductDetails(id).subscribe({
      next: data => this.selectedProduct = data,
      error: err => console.log(err)
    })
  }
}
