package com.example.college.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adress {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String state;
	private String city;
	private String village;
	private int pincode;
	
	public Adress() {
		super();
	}

	public Adress(String state, String city, String village, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.village = village;
		this.pincode = pincode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
