package pl.sda.mg.streamApi.sort;

import pl.sda.mg.streamApi.task1.FootballRepository;
import pl.sda.mg.streamApi.task1.Footballer;
import pl.sda.mg.streamApi.task1.FootballerDatabase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class SortingExample {
    public static void main(String[] args) {
        List<String>fruits = Arrays.asList("banana","cherry","apple","strawberry","grapes");

        fruits.stream()
                .sorted()
                .forEach(fr-> System.out.println(fr));
        FootballRepository footballRepository=new FootballerDatabase();
        List<Footballer>footballers=footballRepository.findAll();

        footballers.stream()
                .sorted(Comparator.comparing(Footballer::getLastName))
                .forEach(footballer -> System.out.println(footballer));
    }
}
