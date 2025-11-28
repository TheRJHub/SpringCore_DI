package com.Setter_Injection;

import com.Field_Injection.BasicSpringProjApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class CarDriver {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CarDriver.class, args);

        Car car = context.getBean(Car.class);

        car.setBrand("Audi");
        car.setPrice(4500000);

        car.getE().setCc(1800);
        car.getE().setMileage(20);

        System.out.println("Brand: " + car.getBrand());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Engine CC: " + car.getE().getCc());
        System.out.println("Engine Mileage: " + car.getE().getMileage());
    }
}
