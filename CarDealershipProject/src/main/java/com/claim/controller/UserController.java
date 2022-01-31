package com.claim.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.User;
import com.claim.entity.Vehicle;
import com.claim.service.UserService;
import com.claim.service.VehicleService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/index")
	public String welcome(Model model) {
		return "index";
	}
	
	@GetMapping("/sign-up")
	public ModelAndView signUp(Model model) {
		return new ModelAndView("sign-up", "user", new User());
	}
	
	@PostMapping("/sign-up")
	public String handleSignUp(Model model, @ModelAttribute("user") User user, HttpSession session) {
		model.addAttribute("newUser", user);
		return "welcome";
	}
	
	@GetMapping("/log-in")
	public ModelAndView logIn(Model model) {
		return new ModelAndView("log-in", "user", new User());
	}
	
	@PostMapping("/log-in")
	public String handleLogIn(Model model, @ModelAttribute("user") User user, HttpSession session) {
		User userFromDatabase = userService.findUserByLogIn(user.getEmail(), user.getPassword());
		model.addAttribute("loggedInUser", userFromDatabase);
		return "home";
	}
	
	/*@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/inventory")
	public ModelAndView showInventory(Model model) {
		return new ModelAndView("inventory", "vehicle", new Vehicle());
	}
	
	@PostMapping("/inventory")
	public String handleShowInventory(Model model, @ModelAttribute("vehicles") Vehicle vehicle, HttpSession session) {
		List<Vehicle> vehicles = vehicleService.getVehicles();
		System.out.println(vehicles.size());
		for (int i = 0; i < vehicles.size(); i++) {
			System.out.println(vehicles);
			}
		model.addAttribute("vehicles", vehicles);
		//System.out.println(vehicles);
		return "inventory";		
	}*/

}
