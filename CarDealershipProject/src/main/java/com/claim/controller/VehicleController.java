package com.claim.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Transaction;
import com.claim.entity.Vehicle;
import com.claim.service.VehicleService;

@Controller
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	/*@GetMapping("/inventory")
	public ModelAndView showInventory(Model model) {
		return new ModelAndView("inventory", "vehicles", new Vehicle());
	}*/
	
	@GetMapping("/inventory")
	public String showInventory(Model model) {
		List<Vehicle> vehicles = vehicleService.getVehicles();
		model.addAttribute("vehicles", vehicles);
		return "inventory";
	}
	
	/*@PostMapping("/inventory")
	public String handleShowInventory(Model model, @ModelAttribute("vehicles") Vehicle vehicle, HttpSession session) {
		List<Vehicle> vehicles = vehicleService.getVehicles();
		System.out.println(vehicles.size());
		model.addAttribute("vehicles", vehicles);
		return "inventory";		
	}*/
	
	/*@GetMapping("/inventory")
	public ModelAndView getAvailableInventory(Model model) {
		return new ModelAndView("inventory", "vehicle", new Vehicle());
	}*/
	
	//@PostMapping("/inventory")
	//public String handleAvailableInventory(Model model, )
	
	/*@GetMapping("/inventory")
	public String handleDisplayAll(Model model) {
		List<Vehicle> vehicles = vehicleService.getVehicles();
		System.out.println(vehicles.size());
		for (int i = 0; i < vehicles.size(); i++) {
			System.out.println(vehicles);
			}
		model.addAttribute("vehicles", vehicles);
		//System.out.println(vehicles);
		return "inventory";		
	} */
	
	/*public ModelAndView payment(Model model) {
		return new ModelAndView("payment", "transaction", new Transaction());
	}*/
	
	//@PostMapping("/payment")
	//public String payment(int stockNumber, double salePrice) {
		//model.getAttribute()
		//model.addAttribute();
	//}
	
	
	
	// public String payment(stockNumber, salePrice)
	// model.getAttribute listing
	// addattirbute listing, findByStocknumber
	// service class ts.completepurchase(stockNumber, userId, sellPrice)

}
