import { Component } from '@angular/core';

@Component({
  selector: 'app-bindingdemo',
  standalone: true,
  imports: [],
  templateUrl: './bindingdemo.component.html',
  styleUrl: './bindingdemo.component.css'
})
export class BindingdemoComponent {
    title: string = 'Biding Demo'
    isDisabled:boolean = true
    imgPath:string = '/assets/images/img1.jpg'
    // color : string = 'pink'
    status : string = 'success'

    myCustomer:Customer = {
      customerId : 100,
      customerName : 'raj kumar',
      customerAge : 25
    }
}

interface Customer {
  customerId : number,
  customerName : string,
  customerAge : number
}