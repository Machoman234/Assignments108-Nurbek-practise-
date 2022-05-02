import java.util.ArrayList;
import java.util.LinkedList;

public class hw10part2 {
    public static void main(String[] args) {
        ArrayList<Integer> amon = new ArrayList<>();
        LinkedList<Integer> adam = new LinkedList<>();

        for(int i = 0; i < 5000000; i++ ){
            amon.add(i);
            adam.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i =0; i< amon.size(); i++)
            amon.get(i);
        long peek = System.currentTimeMillis();
        System.out.println("Time taken for arraylist is " + (peek-start) + " ms.");

        start = System.currentTimeMillis();

        peek = System.currentTimeMillis();
        System.out.println("Time taken for linkedlist is " + (peek-start) + " ms.");

    }
}