package com.example.college.dto;

public class StudentDto {
	private String name;
	private int age;
	private long phone;
	private AddressDto address;
	public StudentDto() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", age=" + age + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	
		}





