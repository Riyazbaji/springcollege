package com.example.college.dto;

public class AddressDto {
	private String city;
	private int pincode;
	public AddressDto(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	public AddressDto() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AddressRegDto [city=" + city + ", pincode=" + pincode + "]";
	}

	}

	

