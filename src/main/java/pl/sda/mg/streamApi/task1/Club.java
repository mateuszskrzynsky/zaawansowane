package pl.sda.mg.streamApi.task1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Club {
    private Country country;
    private String clubName;
}
