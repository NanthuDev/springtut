package com.springtutorial.springtut;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle{
	public void drive() {
		System.out.println("Bike Engine ON");
	}
}
