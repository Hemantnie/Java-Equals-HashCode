package com.practice;

public class Bike {
	private String brand;
	private String model;
	private String type;
	
	public Bike(String brand, String model, String type) {
		this.brand = brand;
		this.model = model;
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}