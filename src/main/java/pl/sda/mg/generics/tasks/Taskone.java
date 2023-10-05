package pl.sda.mg.generics.tasks;

import java.util.Arrays;

public class Taskone {
    public static <T> void swapElements(T[] array, int positionOne, int positionTwo) {
        if (positionOne >= 0 && positionOne < array.length && positionTwo >= 0 && positionTwo < array.length) {
            T temporary = array[positionOne];
            array[positionOne] = array[positionTwo];
            array[positionTwo] = temporary;
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Oryginalna tablica: " + Arrays.toString(intArray));

        int positionOne = 4;
        int positionTwo = 8;
        swapElements(intArray, positionOne, positionTwo);

        System.out.println("Tablica po zamianie: " + positionOne + " and " + positionTwo + ": " + Arrays.toString(intArray));
    }
}
