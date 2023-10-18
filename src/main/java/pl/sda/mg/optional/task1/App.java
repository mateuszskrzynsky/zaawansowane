package pl.sda.mg.optional.task1;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Lśnienie", "horror", 125, LocalDate.of(1980, 10, 11)),
                new Movie("Narodziny zła", "horror", 150, LocalDate.of(2022, 1, 12)),
                new Movie("Incepcja", "thriller", 101, LocalDate.of(2010, 8, 15)),
                new Movie("Nietykalni","komedia",93,LocalDate.of(2011,5,10)));

        MovieRepository movieRepository = new MovieRepository(movies);
        Optional<List<Movie>> filteredMovies = movieRepository.findMovie();
        filteredMovies.ifPresent(filtered -> System.out.println(filtered));


    }
}
