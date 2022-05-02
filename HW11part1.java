package Assignments;

import java.util.*;

public class HW11part1 {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList("h", "e", "g", "f", "a"));


        Set<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union :" + union);


        Set<String> diff = new LinkedHashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("Difference : " + diff);



        Set<String> inter = new LinkedHashSet<>();
        for (String e: set2)
            if (set1.contains(e))
                inter.add(e);
        System.out.println("Intersection : " + inter);
    }
}