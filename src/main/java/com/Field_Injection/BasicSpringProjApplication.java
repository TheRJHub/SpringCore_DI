package com.Field_Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringProjApplication {
	public static void main(String[] args) {
		// Start Spring container
		ApplicationContext context = SpringApplication.run(BasicSpringProjApplication.class, args);
		// Retrieve Car bean
		Car car = context.getBean(Car.class);

		car.setBrand("BMW");
		car.setPrice(5500000);

		car.getE().setCc(2000);
		car.getE().setMileage(15);
		// Use the bean
		System.out.println("Brand: " + car.getBrand());
		System.out.println("Price: " + car.getPrice());
		System.out.println("Engine cc: " + car.getE().cc);
		System.out.println("Engine mileage: "+car.getE().mileage);
	}
}
