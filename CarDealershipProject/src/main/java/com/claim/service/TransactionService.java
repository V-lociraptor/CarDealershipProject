package com.claim.service;

import org.springframework.stereotype.Service;

import com.claim.entity.User;
import com.claim.entity.Vehicle;

@Service
public class TransactionService {
	
	Vehicle vehicle = new Vehicle();
	User user = new User();
	
	// Functionality to place bids on cars listed over 120 days
	
	// public void completePurchase(int stockNumber, int userId, double salePrice)
		// Transaction
	// setter stockNumber
	// setter setUser
	// setter setVehicle
	// setter setSold
	
	/*public void completePurchase(Vehicle vehicle, User user, double salePrice) {
		if (VehicleService.listingAge >= 120) {
			price = price * 0.9;
		}
	}
	
	public void setStockNumber(int stockNumber) {
		this.stockNumber = stockNumber;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void setSold() {
		vehicle(sold) = true;
	}*/
}
