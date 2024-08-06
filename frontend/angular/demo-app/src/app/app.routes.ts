import { Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';

export const routes: Routes = [
    { path: 'signup', component: RegistrationComponent},
    { path: 'signin', component: LoginComponent},
    { path: 'dashboard', component: DashboardComponent}
];
