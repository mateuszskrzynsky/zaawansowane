package pl.sda.mg.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Jan");
        stringList.add("Paweł");
        stringList.add("Karol");
        stringList.add("Tomasz");
        stringList.add("Karolina");
        stringList.add("Anna");

        System.out.println(stringList.get(0));
        System.out.println(stringList);
        System.out.println(stringList.remove("Karol"));
        System.out.println(stringList);
        System.out.println(stringList);

        int[] ints = new int[]{1,2,3,4};
        Integer[] ints2 = new Integer[]{1,2,3,4,5};
        List<Integer>integerList= Arrays.asList(ints2);

    }
}
