import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FetchallproductsComponent } from './fetchallproducts/fetchallproducts.component';
import { AddproductComponent } from './addproduct/addproduct.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'abcshopping';
}
