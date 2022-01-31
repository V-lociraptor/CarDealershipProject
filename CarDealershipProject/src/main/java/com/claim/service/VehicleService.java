package com.claim.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Vehicle;
import com.claim.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	Vehicle vehicle = new Vehicle();
	
	/*public int findListingAge(LocalDate dateListed) {
		dateListed = vehicle.dateListed;
		int listingAge = (int) ChronoUnit.DAYS.between(dateListed, LocalDate.now());
		return listingAge;
	}*/
	
	public Vehicle findVehicleByModel(String model) {
		return vehicleRepository.findVehicleByModel(model);
	}
	
	public List<Vehicle> getVehicles() {
		return vehicleRepository.getVehicles();
	}
	
	// Add pictures
	
	// Provide bidding option for cars listed more than 120 days
	
	// Add functionality to change cars' "sold" status to "true"
	/*public void sellVehicle() {
		Vehicle.sold = true;
	}*/
	
	
}
