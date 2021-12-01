package com.workz.wallet;

public class Wallet {

	private String brand;
	private String color;
	private Material material;
	private double price;
	private Money money;
	private ATMCard atmcard;
	private Photo photo;

	public Wallet() {
		super();
	}

	public Wallet(String brand, String color, Material material, double price, Money money, ATMCard atmcard,
			Photo photo) {
		super();
		this.brand = brand;
		this.color = color;
		this.material = material;
		this.price = price;
		this.money = money;
		this.atmcard = atmcard;
		this.photo = photo;
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

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

	public ATMCard getAtmcard() {
		return atmcard;
	}

	public void setAtmcard(ATMCard atmcard) {
		this.atmcard = atmcard;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

}
