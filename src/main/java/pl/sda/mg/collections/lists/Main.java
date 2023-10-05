package pl.sda.mg.collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new LinkedList<>();
        List<Integer> myList2 = new ArrayList<>();

        myList.add(2);
        myList.add(1);

        printPlusValue(myList,2);
    }
    private static void printPlusValue(List<Integer> list, int value){
        for (Integer o : list) {
            System.out.println(o+value);
        }
    }
    }

