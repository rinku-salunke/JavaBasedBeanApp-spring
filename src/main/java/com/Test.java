package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {

	
ApplicationContext ac=new  AnnotationConfigApplicationContext(SpringConfig.class);

Student s1= ac.getBean("stu", Student.class);

System.out.println(s1.getAdr().getAreaname());
}
}


