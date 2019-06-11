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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(!(obj instanceof Bike)) return false;
		if(((Bike)obj).brand.equals(this.brand) && ((Bike)obj).model.equals(this.model) && ((Bike)obj).type.equals(this.type) ) return true;
		return false;
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
