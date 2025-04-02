package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


@Bean(name = "stu")
public Student s() {
	Student s=new Student();
	//s.setAdr(a());
	return s;
}
	
	
	@Bean
	public Address a() {
		Address adr=new Address();
		adr.setAreaname("Karvenagar");
		return adr;
	}	
}
