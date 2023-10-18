package pl.sda.mg.optional.task1;
import lombok.Builder;
import lombok.Value;
import java.time.LocalDate;
@Builder
@Value
public class Movie {
    String title;
    String type;
    long duration;
    LocalDate releaseDate;

}

