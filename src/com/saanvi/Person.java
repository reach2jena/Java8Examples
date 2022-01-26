package com.saanvi;

public class Person {

	private String phoneNumber;
	private String name;
	private String countryName;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Person(String phoneNumber, String name, String countryName) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.countryName = countryName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
