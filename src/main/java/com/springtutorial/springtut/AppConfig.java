package com.springtutorial.springtut;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springtutorial.springtut")
public class AppConfig {
	
	
//@Bean
// public Suzuki getBike() {
//	 return new Suzuki();
// }
//
////@Bean
////public Edition getEdition() {
//	//return new SpecialEdition();
////}
//
//@Bean 
//public Edition getBEdition() {
//	return new BasicEdition();
//}
}
