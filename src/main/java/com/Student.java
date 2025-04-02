package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
@Autowired
private Address adr;


public Address getAdr() {
	return adr;
}

public void setAdr(Address adr) {
	this.adr = adr;
}	

public Student() {
	System.out.println("Constructor");
}
}
