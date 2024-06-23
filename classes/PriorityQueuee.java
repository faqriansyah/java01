package classes;

import java.util.*;

public class PriorityQueuee {
    public static void main(String args[]) {
        PriorityQueue<String> Buah = new PriorityQueue<String>();
        Buah.add("Semangka"); //
        Buah.add("Belimbing"); //
        Buah.add("Anggur");//
        Buah.add("Durian");
        Buah.add("Langsat"); 

        System.out.println("head:" + Buah.element()); // Mengeluarkana anggur
        System.out.println("head:" + Buah.peek()); // Mengeluarkan anggur juga

        System.out.println("iterating the Buah elements:");
        Iterator<String> itr = Buah.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()   ); // datanya masih lengkap
        }
        
        Buah.remove();
        Buah.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = Buah.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}