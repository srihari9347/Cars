package com.Cars.cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class CarService {
   public List<Car> DesOfCars(){
	   List<Car> allCars= new ArrayList<Car>();
  allCars.add(new Car(1,"Benz","Mercedes A Class","30.94L","Black"));
  allCars.add(new Car(2,"Audi","Q2","35L","Black"));
  allCars.add(new Car(3,"Ferrari","Portofino","3.50Cr","White"));
  allCars.add(new Car(4,"Suzuki","Maruti Suzuki","3.39L","White"));
  allCars.add(new Car(5,"Tata","Tiago","5.39Cr","Grey"));
  allCars.add(new Car(6,"BMW","BMW X1","41.50L","Black"));
  allCars.add(new Car(7,"Honda","Amaze","6.69L","Black"));
  return allCars;
}
  
  public List<Car> getCar(String brand) {
	  return list.stream().filter(car -> car.getBrand().equals(brand))
				.collect(Collectors.toList()) ;
  }
  
  List<Car> list = DesOfCars();
  public Car addCar(Car car) {
	  list.add(car);
	  return car;
  }
  
  public List<Car> getCarId(int id) {
		return list.stream().filter(cars -> cars.getId() == id)
				.collect(Collectors.toList()) ;
	}
  
  public List<Car> getAllCars(){
	  return list;
  }

public String update(Car car) {
	boolean sameSpecFound = false;
	for (Car currentSpec:list) {
		if(currentSpec.getBrand().equals(car.getBrand())) {
			sameSpecFound = true;
			currentSpec.setBrand(car.getBrand());
			currentSpec.setModel(car.getModel());
			currentSpec.setPrice(car.getPrice());
			currentSpec.setColour(car.getColour());
		}
	}
	if(!sameSpecFound) {
		list.add(car);
		return "New Car added successfully";
	}
	return "Car description updated";
}

public String deleteCar(int id) {
	 list = list.stream().filter(car -> car.getId()!= id)
	       .collect(Collectors.toList());
	 return "Car removed successfully";
	
}

public String deleteCarByBrand(String brand) {
	 list = list.stream().filter(car -> !car.getBrand().equals(brand))
		       .collect(Collectors.toList());
		 return "Brand removed successfully";
}

}
