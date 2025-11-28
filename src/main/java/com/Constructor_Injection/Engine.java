package com.Constructor_Injection;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@Component
public class Engine {
    int cc;
    int mileage;
}
