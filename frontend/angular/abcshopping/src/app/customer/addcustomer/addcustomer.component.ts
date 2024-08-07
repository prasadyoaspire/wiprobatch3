import { CommonModule } from '@angular/common';
import { Component, ViewChild } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-addcustomer',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './addcustomer.component.html',
  styleUrl: './addcustomer.component.css'
})
export class AddcustomerComponent {

   customer = {
    id:'',
    customerName : '',
    email:'',
    dob : '',
    mobile: '',
    city:''
  };

  onSubmit(): void {
    // console.log(JSON.stringify(this.customer, null, 2));
    console.log(this.customer);
   
  }

  onReset(customerForm: NgForm): void {
    customerForm.reset();
  }
}
