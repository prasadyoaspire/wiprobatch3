package com.abc.reactivedemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Mono;

public class MonoDemo1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("start");
		
		Mono<Integer> intMono = Mono.just(100).delayElement(Duration.ofSeconds(5));
		intMono.subscribe(n->System.out.println(n));

		System.out.println("end");
		
		System.out.println("Press any key to end");
		System.in.read();	
	}

}
