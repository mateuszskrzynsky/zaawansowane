package pl.sda.mg.streamApi.task1;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Address {
    private String street;
    private String city;
    private String zipCode;
    private Country country;
}
