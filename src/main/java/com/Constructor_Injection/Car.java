package com.Constructor_Injection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component
public class Car {
    private String brand;
    private double price;
    private Engine e;

    @Autowired
    public Car(Engine e) {
        this.e = e;
    }
}
