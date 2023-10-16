package pl.sda.mg.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalApp {
    public static void main(String[] args) {

        Presenter p = text -> System.out.println(text);
        Presenter p2 = text -> System.out.println(text.toUpperCase());
        p.show("Hello from my first functional interface!");
        p2.show("Hello from my first functional interface!");

        //default functional interfaces
        Supplier<String> supplier = () -> "Hi from supplier!";
        System.out.println(supplier.get());
        Function<Integer, String> function = integer -> "Intiger jako String" + integer;
        System.out.println(function.apply(5));
        Consumer<String> consumer = text -> System.out.println("Moje imię: " + text);
        consumer.accept("Mateusz");
        Predicate<String> predicate = str -> str.equalsIgnoreCase("Test");
        System.out.println(predicate.test("test"));
    }
}
