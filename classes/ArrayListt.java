package classes;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> food1 = new ArrayList<>();
        food1.add("Nasgor");
        food1.add("Nasi Kuning");
        food1.add("Telur Mata Sapi");
        ArrayList<String> food2 = new ArrayList<>(10);
        food2.addAll(food1);
        food2.add("dummy");
        food2.add("Ayam");
        food2.add("Bebek");
        food2.add("Cicak");
        food2.add("Jambu");
        food2.add("Ikan Tuna");
        List<String> anotherFood = List.of("Bebek Bakar", "Lele", "Tempe");
        food2.addAll(anotherFood);

        Collections.sort(food2);

        // Iterator

        Iterator semuaMakanan = food2.iterator();
        while (semuaMakanan.hasNext())
            System.out.println(semuaMakanan.next());

        System.out.println("==============================");

        for (String makanan : food2) {
            System.out.println(makanan);
        }
    }
}
