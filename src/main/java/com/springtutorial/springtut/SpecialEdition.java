package com.springtutorial.springtut;

import org.springframework.stereotype.Component;

@Component
public class SpecialEdition implements Edition {

	@Override
	public void edition() {
		// TODO Auto-generated method stub
		System.out.println("Special Edition for Racing");

	}

}
