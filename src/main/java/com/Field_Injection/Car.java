package com.Field_Injection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Getter
@Setter
@ToString
@Component
public class Car {
    private String brand;
    private double price;

    @Autowired
    private Engine e;//field injection

}
