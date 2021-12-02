package com.xworkz.lockapp;

public class Lock {
	
	private String brand;
	private String color;
	private Material material;
	private double price;
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
