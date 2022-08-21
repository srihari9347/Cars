package com.Cars.cars;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Car")
public class CarController {
	@Autowired
	CarService service;
	
//get brands of cars	
	@GetMapping("/brands")
	public List<String> listOfCars(){
		List<String> brands = Arrays.asList("Benz","Audi","Ferrari","Suzuki","Tata","BMW","Honda");
		return brands;
	}
	
//get cars of brands	
	@GetMapping("/description")
	public List<Car> DesOfCars(){
		return service.DesOfCars();
	}
//get cars of specified brand
	@GetMapping("/byBrand/{brand}")
	public List<Car> getCarByBrand(@PathVariable String brand) {
		return service.getCar(brand);
	}
	
//get cars by id
	@GetMapping("/byId/{id}")
	public List<Car> getCarById(@PathVariable int id){
		return service.getCarId(id);
	}
	
//add new cars to the list	
	@PostMapping("/add")
	public String addCarByBrand(@RequestBody Car car) {
		 service.addCar(car);
		 return "new car added successfully";
	}
	
//get list of all cars	
	@GetMapping("/all")
	public List<Car> allCars(){
		return service.getAllCars();
	}
	
//update the existing car or add new car	
	@PutMapping("/update")
	public String addOrUpdate(@RequestBody Car car) {
		return service.update(car);
	}
	
//delete by id
	@DeleteMapping("/deleteById/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteCar(id);
	}
	
//delete by brand
	@DeleteMapping("/deleteByBrand/{brand}")
	public String delete(@PathVariable String brand) {
		return service.deleteCarByBrand(brand);
	}
	
}
