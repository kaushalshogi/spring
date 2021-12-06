package com.workz.wallet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String springConfigFile = "spring.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);

		//Wallet w=new Wallet("puma", "brown", "linun", 2000.0, "cash", "visa", "passport");
	    //Wallet wallet=new Wallet(springConfigFile, springConfigFile, null, 0, null, null, null)
		//Wallet w1= new Wallet();
		//w1.setAtmcard(null);
		
		Photo1 photo=springContainer.getBean(Photo1.class);
	    System.out.println(photo);
	
		
	}
		
		
}
