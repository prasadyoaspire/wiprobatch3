package com.abc.reactivedemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Flux;

public class FluxDemo3 {

	public static void main(String[] args) throws IOException {
		
		User u1 = new User(1,"raj",52);
		User u2 = new User(2,"sam",52);
		User u3 = new User(3,"dam",32);
		User u4 = new User(4,"boom",42);
		
		Flux<User> fluxUsers = Flux.just(u1,u2,u3,u4).delayElements(Duration.ofSeconds(2));
		fluxUsers.subscribe(u-> System.out.println(u));
		
		System.out.println("Press any key to end");
		System.in.read();	

	}

}
