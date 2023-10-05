package pl.sda.mg.collections.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");
        stringList.add("jeden");

        System.out.println(stringList.size());

        Set<String> stringSet=new HashSet<>(stringList);
        System.out.println(stringSet.size());

    }
}
