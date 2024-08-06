import { CurrencyPipe, DatePipe, LowerCasePipe, PercentPipe, TitleCasePipe, UpperCasePipe } from '@angular/common';
import { Component } from '@angular/core';
import { GreetPipe } from '../pipes/greet.pipe';

@Component({
  selector: 'app-pipedemo',
  standalone: true,
  imports: [
    UpperCasePipe, 
    LowerCasePipe, 
    TitleCasePipe, 
    DatePipe, 
    PercentPipe,
    CurrencyPipe,
    GreetPipe],
  templateUrl: './pipedemo.component.html',
  styleUrl: './pipedemo.component.css'
})
export class PipedemoComponent {

  firstName:string = "Rama singh"
  title:string = "This is pipedemo";
  today = new Date();

  pno : number = 0.23;

  salary : number = 5000;

  myNum = 1234;
  
 
}
