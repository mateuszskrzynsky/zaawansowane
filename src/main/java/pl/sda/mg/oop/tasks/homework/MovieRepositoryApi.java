package pl.sda.mg.oop.tasks.homework;

import java.util.List;

public interface MovieRepositoryApi {
    void add(Movie movie);
    void delete(Movie movie);
    List<Movie> findAll();
    List<Movie> findByTitle(String title);

}
