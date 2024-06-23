package classes;

import java.util.TreeSet;
import java.util.Iterator;



public class TreeSett {
    public static void main(String[] args) {
        TreeSet<String> buah = new TreeSet<>();
        buah.add("Semangka");
        buah.add("Semangka");
        buah.add("Pir");
        buah.add("Jambu");
        buah.add("Kelengkeng");
        buah.add("Pepaya");
        buah.add("Mangga");
        String first = buah.pollFirst();
        String last = buah.pollLast();

        System.out.println("First element " + first); // Jambu
        System.out.println("Last element " + last); // Semangka 
        System.out.println("Descending order " + buah.descendingSet()); // [Pir, Pepaya, Mangga, Kelengkeng]
        System.out.println(buah.floor(last)); // Pir
        System.out.println(buah.higher("Pepaya")); // Pir

        Separator.xsp();

        Iterator<String> it = buah.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}