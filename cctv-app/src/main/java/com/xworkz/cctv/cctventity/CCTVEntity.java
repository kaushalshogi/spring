package com.xworkz.cctv.cctventity;

public class CCTVEntity {
	private String brand;
	private String color;
	private double prize;
	private Camera cameraSize;
	
	public CCTVEntity(String brand) {
		super();
		this.brand = brand;
	}

	public CCTVEntity() {
		super();
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

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public Camera getCameraSize() {
		return cameraSize;
	}

	public void setCameraSize(Camera cameraSize) {
		this.cameraSize = cameraSize;
	}

	
	
	

}
