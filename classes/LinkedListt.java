package classes;

import java.util.*;

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList<String> food = new LinkedList<>();
        food.add("Lele");
        food.add("Ayam");
        food.add("Bebek");
        food.add("Sate");
        food.add("Jambu");
        food.add("Jambu");
        food.add("Ikan Tuna");
        food.addFirst("Rendang");

        String firstFood = food.getFirst();
        String lastFood = food.getLast();
        String firstElemen = food.poll();
        String popFood = food.pop();
        int indexOf = food.indexOf("Sate");
        int lastIndexOf = food.lastIndexOf("Jambu");

        System.out.println("First Food : " + firstFood);
        System.out.println("Last Food : " + lastFood);
        System.out.println("First food before deleted : " + firstElemen);
        System.out.println("POP : " + popFood);
        System.out.println("Index of Sate : " + indexOf);
        System.out.println("Last index of Jambu : " + lastIndexOf);

        Separator.xsp();
        System.out.println(food);
        Separator.xsp();

        System.out.println("Iterated Linked List : ");
        Iterator<String> iterateFood =food.iterator();
        while(iterateFood.hasNext()) System.out.println(iterateFood.next());
    }
}
