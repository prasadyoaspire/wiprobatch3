package com.abc.reactivedemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Flux;

public class FluxDemo2 {

	public static void main(String[] args) throws IOException {
		
		Flux<String> fruitFlux = Flux.just("Apple", "orange", "banana","mango").delayElements(Duration.ofSeconds(1));
		fruitFlux.subscribe(f->System.out.println(f));

		System.out.println("Press any key to end");
		System.in.read();	
	}

}
