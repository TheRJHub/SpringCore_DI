package com.Constructor_Injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class CarDriver {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(com.Constructor_Injection.CarDriver.class, args);

        com.Constructor_Injection.Car car = context.getBean(Car.class);

        car.setBrand("Alto");
        car.setPrice(500000);

        car.getE().setCc(800);
        car.getE().setMileage(16);

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Engine CC: " + car.getE().getCc());
        System.out.println("Engine Mileage: " + car.getE().getMileage());
    }
}
