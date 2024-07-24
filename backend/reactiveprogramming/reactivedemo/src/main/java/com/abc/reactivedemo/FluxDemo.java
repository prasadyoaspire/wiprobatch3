package com.abc.reactivedemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Flux;

public class FluxDemo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("start");
		
//		Flux<Integer> fluxNumbers = Flux.range(1, 10).delayElements(Duration.ofSeconds(5));
//		fluxNumbers.subscribe(n->System.out.println(n));
		
		Flux<Integer> flux = Flux.range(1, 10).delayElements(Duration.ofSeconds(1)).log();	
		flux.filter(i -> i % 2 == 0).map(i -> i * 2).subscribe(System.out::println);

		
		System.out.println("done");							
		
		System.out.println("Press any key to end");
		System.in.read();	
		
	}
}
