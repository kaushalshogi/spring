package com.xworkz.cctv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		String springConfigFile="spring.xml";
		ApplicationContext springcontainer= new ClassPathXmlApplicationContext(springConfigFile);
		System.out.println("spring container is created"+springcontainer);

	}

}