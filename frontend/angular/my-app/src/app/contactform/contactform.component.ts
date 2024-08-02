import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-contactform',
  standalone: true,
  imports: [ReactiveFormsModule,CommonModule],
  templateUrl: './contactform.component.html',
  styleUrl: './contactform.component.css'
})
export class ContactformComponent {

  profileForm = new FormGroup({
    firstName : new FormControl(''),
    lastName : new FormControl(''),
    email : new FormControl(''),
    gender : new FormControl('')
  }
  );

  createProfile() {
    console.log(this.profileForm.value);

    // console.log(this.profileForm.value.firstName);
    // console.log(this.profileForm.value.lastName);
    // console.log(this.profileForm.value.email);
    // console.log(this.profileForm.value.gender);
  }
}
