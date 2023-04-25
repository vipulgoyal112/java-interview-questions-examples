package com.immutable;

public class Address {

	private int streetNumber;
	private String area;

	public Address(int streetNumber, String area) {
		super();
		this.streetNumber = streetNumber;
		this.area = area;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "streetNumber : " + this.streetNumber + ", area : " + this.area;
	}

}
