package com.springtutorial.springtut;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle {
	public void drive() {
		System.out.println("Engine ON");
	}
}
