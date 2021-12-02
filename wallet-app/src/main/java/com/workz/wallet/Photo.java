package com.workz.wallet;

public class Photo {
	
	private int pPrice;
	private String pSize;
	
	public Photo() {

		System.out.println("my photos");
	}

	public Photo(int pPrice, String pSize) {
		super();
		this.pPrice = pPrice;
		this.pSize = pSize;
	}

	@Override
	public String toString() {
		return "Photo [pPrice=" + pPrice + ", pSize=" + pSize + "]";
	}
	
}
