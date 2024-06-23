package classes;

import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book> {
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(Book b) {
        if(id > b.id) {
            return 1;
        } else if(id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class PriorityQueueeBook {
    public static void main(String[] args) {
        Queue<Book> queue = new PriorityQueue<>();
        Book b1 = new Book(220, "Sejarah Komputer", "Hendra", "Sinar Bulan", 80);
        Book b2 = new Book(547, "Membudidayakan Sistem Operasi", "Wildan", "Anggrek Manis", 8);

        queue.add(b1);
        queue.add(b2);
        System.out.println("Melintasi elemen antrian : ");
        for(Book b:queue) {
            System.out.println(b.id);
            System.out.println(b.name);
            System.out.println(b.author);
            System.out.println(b.publisher);
            System.out.println(b.quantity);
            Separator.xsp();
        }
    }
}
