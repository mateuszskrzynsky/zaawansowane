package pl.sda.mg.oop.tasks.homework;

import java.util.List;

public class MovieApp {
    public static void main(String[] args) {
        MovieRepositoryApi repository = new MovieRepository();

        Movie movie1=new Movie("Inception",2010);
        Movie movie2=new Movie("The Showshank Redempiton",1994);
        Movie movie3=new Movie("The Dark Knight",2008);
        Movie movie4=new Movie("Forest Gump",1994);
        Movie movie5=new Movie("Pulp Fiction",1994);

        repository.add(movie1);
        repository.add(movie2);
        repository.add(movie3);
        repository.add(movie4);
        repository.add(movie5);

        //wyswietl wszystkie
        printMovies(repository);

        //usuwanie
        repository.delete(movie5);

        //wyswietl wszystkie
        printMovies(repository);

        //wyszukaj po tytule
        List<Movie> moviesByTitle = repository.findByTitle("Inception");
        System.out.println(moviesByTitle);

    }

    private static void printMovies(MovieRepositoryApi repository) {
        System.out.println("Nasze Filmy: ");

        List<Movie> movieList = repository.findAll();
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
