package com.claim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.sql.Date;
import com.claim.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	
	// Search for car by model
	@Query ("SELECT V FROM Vehicle V WHERE V.model = ?1 AND V.sold = false")
	Vehicle findVehicleByModel(String model);
	
	// Show all cars
	@Query ("SELECT V FROM Vehicle V WHERE V.sold = false")
	List<Vehicle> getVehicles();
	
	
}
