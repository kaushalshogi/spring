package com.xworkz.lockapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Key {
	
	@Value("${brand}")
	String brand;
	
	@Value("${size}")
	int size;
	
	@Value("${length}")
	double length;
	
	@Value("${weight}")
	double weight;
	
	public Key() {
	}

	

	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
