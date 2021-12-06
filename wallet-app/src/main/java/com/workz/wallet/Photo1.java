package com.workz.wallet;

public class Photo1 {
		private int pPrice;
		private String ptype;
		
		public Photo1() {

			System.out.println("my photos");
		}
		

		public Photo1(int pPrice, String ptype) {
			super();
			this.pPrice = pPrice;
			this.ptype = ptype;
		}


		public int getpPrice() {
			return pPrice;
		}

		public void setpPrice(int pPrice) {
			this.pPrice = pPrice;
		}

		public String getPtype() {
			return ptype;
		}

		public void setPtype(String ptype) {
			this.ptype = ptype;
		}

		
}
