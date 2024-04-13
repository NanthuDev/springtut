package com.springtutorial.springtut;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasicEdition implements Edition {

	@Override
	public void edition() {
		// TODO Auto-generated method stub
		System.out.println("Basic Edition for Racing");
	}

}
