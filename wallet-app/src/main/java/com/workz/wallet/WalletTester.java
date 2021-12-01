package com.workz.wallet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WalletTester {

	public static void main(String[] args) {
		String springConfigFile = "spring.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);

	//	System.out.println("throw setter method");
	/*	Wallet wallet = springContainer.getBean(Wallet.class);
		System.out.println(wallet.getBrand());
		System.out.println(wallet.getColor());
		System.out.println(wallet.getAtmcard());
		System.out.println(wallet.getPrice());
		System.out.println(wallet.getPhoto());
		System.out.println("wallet" + wallet);
		
		Wallet wallet1 = springContainer.getBean(Wallet.class);
		System.out.println("wallet1" + wallet1);
		Wallet wallet2 = springContainer.getBean(Wallet.class);
		System.out.println("wallet2" + wallet2);*/
		
		System.out.println("========================");
		System.out.println("through parametrize constructor");
		Wallet wallet3 = springContainer.getBean(Wallet.class);
		System.out.println(wallet3.getBrand());
		System.out.println(wallet3.getColor());
		System.out.println(wallet3.getAtmcard());
		System.out.println(wallet3.getPrice());
		System.out.println(wallet3.getPhoto());
		System.out.println(wallet3.getMaterial());
		System.out.println(wallet3.getMoney());
		
		System.out.println("wallet" + wallet3);
		Wallet wallet4 = springContainer.getBean(Wallet.class);
		System.out.println("wallet" + wallet4);
		
		Wallet wallet5 = springContainer.getBean(Wallet.class);
		System.out.println("wallet" + wallet5);
		System.out.println();
		

	}

}
