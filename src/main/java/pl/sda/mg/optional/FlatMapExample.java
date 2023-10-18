package pl.sda.mg.optional;

import java.util.Optional;

public class FlatMapExample {
    public static void main(String[] args) {
        Optional<String>helloWorldContainer= Optional.of("Hello World!");
        Optional<Integer>integerContainer=helloWorldContainer.flatMap(text->Optional.of(text.length()));
        integerContainer.ifPresent(lenght-> System.out.println("Długość tekstu: "+lenght));
    }
}
