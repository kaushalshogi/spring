package com.xworkz.cctv.cctventity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "spring.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);
		System.out.println("spring container is created" + springContainer);

		CCTVEntity cctv = springContainer.getBean(CCTVEntity.class);
		System.out.println(cctv.getBrand());
		System.out.println(cctv.getColor());
		System.out.println(cctv.getPrize());
		System.out.println(cctv.getCameraSize());
		
		Camera c= springContainer.getBean(Camera.class);
		System.out.println(c.getBrand());
		System.out.println(c.getPrice());
		
		
	
		

	}

}
