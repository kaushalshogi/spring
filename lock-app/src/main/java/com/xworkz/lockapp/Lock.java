package com.xworkz.lockapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lock {
	
	@Value("uropa")
	private String brand;
	
	private String color;
	
	@Autowired
	private Material material;
	
	@Value("200")
	private double price;
	
	@Autowired
	private Key key;
	
	public Lock() {
		super();
	}
	public Lock(String brand, String color, Material material, double price, Key key) {
		super();
		this.brand = brand;
		this.color = color;
		this.material = material;
		this.price = price;
		this.key = key;
	}
	public String getBrand() {
		return brand;
	}
	

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	
	@Value("silevr")
	public void setColor(String color) {
		this.color = color;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	@Override
	public String toString() {
		return "Lock [brand=" + brand + ", color=" + color + ", material=" + material + ", price=" + price + ", key=" + key + "]";
	}
	
	

}
