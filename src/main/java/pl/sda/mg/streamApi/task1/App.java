package pl.sda.mg.streamApi.task1;

public class App {
    public static void main(String[] args) {
        FootballRepository repository = new FootballerDatabase();
        System.out.println(repository.findAll());
        System.out.println("****************");
        System.out.println(repository.findByClub("FC Barcelona"));

    }
}
