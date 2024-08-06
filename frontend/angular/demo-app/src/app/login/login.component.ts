import { Component } from '@angular/core';
import { User } from '../model/User';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { AuthService } from '../service/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  users: User[] = []
  loginErrorMsg : string = '';

  loginForm = new FormGroup({
    email: new FormControl(''),
    pwd: new FormControl('')
  })

  constructor(private authService: AuthService, private route: Router) { }

  doLogin() {
    const email = this.loginForm.value.email;
    const pwd = this.loginForm.value.pwd;
    this.authService.getAllUsers().subscribe(data => {
      const user = data.find(u => u.email === email && u.password === pwd);
      if (user) {
        //alert("Login Success")
        this.route.navigate(['/dashboard']);
      }
      else {
        //alert("Login Failed");
        this.loginErrorMsg = "Login Failed"
      }
    });
  }
}
