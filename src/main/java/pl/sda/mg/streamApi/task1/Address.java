package pl.sda.mg.streamApi.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Address {
    private String street;
    private String city;
    private String zipCode;
    private Country country;
}
