package pl.sda.mg.optional.task1;

import lombok.Builder;
import lombok.Value;
import java.util.List;
import java.util.Optional;
@Builder
@Value
public class MovieRepository {
    private List<Movie> movies;
    public Optional<List<Movie>> findMovie() {
        List<Movie> filter = movies.stream()
                .filter(movie -> movie.getType().equals("horror"))
                .filter(movie -> movie.getReleaseDate().getYear() >= 2018)
                .filter(movie -> movie.getDuration() > 20)
                .toList();

        return Optional.ofNullable(filter);
    }
}

