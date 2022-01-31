package com.claim.entity;

import java.time.LocalDate;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="car_inventory")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "stock_number")
public class Vehicle {
	
	@Override
	public String toString() {
		return "Vehicle [stockNumber=" + stockNumber + ", manufacturer=" + manufacturer + ", make=" + make + ", model="
				+ model + ", style=" + style + ", transmission=" + transmission + ", mileage=" + mileage + ", color="
				+ color + ", used=" + used + ", description=" + description + ", dateListed=" + dateListed + ", price="
				+ price + ", sold=" + sold + ", imagePath=" + imagePath + "]";
	}


	@Id
	@Column(name="stock_number")
	private Integer stockNumber;
	
	@Column(name="manufacturer")
	private String manufacturer;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="style")
	private String style;
	
	@Column(name="transmission")
	private String transmission;
	
	@Column(name="mileage")
	private int mileage;
	
	@Column(name="color")
	private String color;
	
	@Column(name="used")
	private boolean used;
	
	@Column(name="description")
	private String description;
	
	@Column(name="date_listed")
	private LocalDate dateListed;
	
	@Column(name="price")
	private double price;
	
	@Column(name="sold")
	private boolean sold;
	
	private String imagePath;
	
	public Vehicle() {	
	}
	
	public Vehicle(int stockNumber, String manufacturer, String make, String model, String style, String transmission,
			int mileage, String color, boolean used, String description, LocalDate dateListed, double price, boolean sold, String imagePath) {
		this.stockNumber = stockNumber;
		this.manufacturer = manufacturer;
		this.make = make;
		this.model = model;
		this.style = style;
		this.transmission = transmission;
		this.mileage = mileage;
		this.color = color;
		this.used = used;
		this.description = description;
		this.dateListed = dateListed;
		this.price = price;
		this.sold = sold;
		this.imagePath = imagePath;
	}


	public int getStockNumber() {
		return stockNumber;
	}


	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getstyle() {
		return style;
	}


	public void setstyle(String style) {
		this.style = style;
	}


	public String getTransmission() {
		return transmission;
	}


	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean isUsed() {
		return used;
	}


	public void setUsed(boolean used) {
		this.used = used;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDateListed() {
		return dateListed;
	}


	public void setDateListed(LocalDate dateListed) {
		this.dateListed = dateListed;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean getSold() {
		return sold;
	}
	
	public void setSold(boolean sold) {
		this.sold = sold;
	}


	public String getImagePath() {
		return imagePath;
	}


	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
