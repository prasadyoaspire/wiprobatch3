import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'greet',
  standalone: true
})
export class GreetPipe implements PipeTransform {

  transform(value: string, ...args: string[]): string {
    
    return "Hello "+value ;
  }

}
