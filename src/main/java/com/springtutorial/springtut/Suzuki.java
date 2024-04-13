package com.springtutorial.springtut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Suzuki {
	
	@Autowired
	@Qualifier("specialEdition")
	Edition version;
	
	public Edition getVersion() {
		return version;
	}

	public void setVersion(Edition version) {
		this.version = version;
	}

	public void spec() {
		System.out.println("150CC Sports");
		version.edition();
	}

}
