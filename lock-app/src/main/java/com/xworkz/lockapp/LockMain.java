package com.xworkz.lockapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LockMain {

	public static void main(String[] args) {
		
		String springConfigFile="spring.xml";
		ApplicationContext springConatiner=new ClassPathXmlApplicationContext(springConfigFile);
		
		Key key=springConatiner.getBean(Key.class);
		System.out.println(key.getBrand());
		System.out.println(key.getLength());
		System.out.println(key.getSize());
		System.out.println(key.getWeight());
		
		
	
		
	}

}
