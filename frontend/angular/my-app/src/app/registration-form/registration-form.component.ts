import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-registration-form',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './registration-form.component.html',
  styleUrl: './registration-form.component.css'
})
export class RegistrationFormComponent {

  firstName:string = '';
  lastName:string = '';
  email:string = '';
  age : number = 0;

  doRegistration(registrationForm:any) {
    console.log(registrationForm.value);
    this.firstName = registrationForm.value.fname;
    this.lastName = registrationForm.value.lname;
    this.email = registrationForm.value.email;
    this.age = registrationForm.value.age;

    //call api to save this data
   // customerService.addnewCustomer(registrationForm.value);
  }

}
