package Assignments;

public class HW9part1 {

    public static void main(String[] args) {
        Integer[] list = new Integer[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        System.out.println(Search(list, 1));
        System.out.println(Search(list, 10));
        System.out.println(Search(list, 30));
    }

    public static <E extends Comparable<E>> int Search(E[] list, E value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }
}