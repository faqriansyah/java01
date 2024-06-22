import java.util.*;

import classes.Separator;

public class Main {
    public static void main(String[] args) {
        List<String> buah0 = new ArrayList<>();
        buah0.add("Kelengkeng");
        buah0.add("Rambutan");
        HashSet<String> buah = new HashSet<>(buah0);
        buah.add("Pepaya");
        buah.add("Semangka");
        buah.add("Semangka");
        buah.add("Mangga");
        System.out.println(buah.isEmpty());
        System.out.println(buah.size());

        Separator.xsp();

        System.out.println("Iteration");
        Iterator<String> iterator1 = buah.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        Separator.xsp();

        System.out.println("remove if");
        buah.removeIf(x->x.contains("Mangga"));
        System.out.println(buah);

        Separator.xsp();

        Spliterator<String> spliterator = buah.spliterator();
        spliterator.forEachRemaining(System.out::println);

    }
}
