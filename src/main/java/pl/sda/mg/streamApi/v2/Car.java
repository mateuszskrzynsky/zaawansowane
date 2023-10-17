package pl.sda.mg.streamApi.v2;

import lombok.*;

@Getter
@Setter
@Builder
public class Car {
    private String model;
    private String brand;
    private String productionYear;
    private FuelType fuelType;
}

