package pl.sda.mg.oop.tasks.homework;

public class Movie {
    private String title;
    private int yearOfRelease;

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
