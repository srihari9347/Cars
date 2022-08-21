package com.Cars.cars;

public class Car {
   private int id;
   private String brand;
   private String model;
   private String price;
   private String colour;
   
public Car(int id,String brand, String model, String price, String colour) {
	super();
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.price = price;
	this.colour = colour;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}


}
