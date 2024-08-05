import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../model/Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl: string = "http://localhost:8081"

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<Product> {
    return this.http.get<Product>(this.baseUrl + "/product/");
  }

  addNewProduct(product: any): any {
    const headers = new HttpHeaders();
    headers.set('content-type', 'application/json');
    return this.http.post(this.baseUrl + "/product/", product, { headers: headers });
  }
}
