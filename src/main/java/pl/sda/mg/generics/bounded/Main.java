package pl.sda.mg.generics.bounded;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3,5,8,13,21);
        List<Double> doubles = Arrays.asList(2.0,3.5,7.8,8.12,33.43,123.123,3245.98);

        printValuesWithExtend(ints);
        printValuesWithExtend(doubles);

        System.out.println("=============");

        printValuesWithExtend(ints);

    }
    private static void printValuesWithExtend(List<? extends Number>list){
        for (Number number : list) {
            System.out.println(number);
        }
    }
    private static void printCaluesWithSuper(List<? super Integer>list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
