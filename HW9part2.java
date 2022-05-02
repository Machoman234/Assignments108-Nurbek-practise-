package Assignments;

import java.util.ArrayList;

public class HW9part2 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayListlist = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayListlist.add(i);
        }
        System.out.println(max(arrayListlist));

    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return max;
    }
}