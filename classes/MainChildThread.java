package classes;

class child2 extends Thread {
    public void run() {
        System.out.println("Ini dari child 2");
    }
}

class child1 extends Thread {
    public void run() {
        System.out.println("Ini dari child 1");
    }
}

public class MainChildThread {
    public static void main(String[] args) {
        child1 t1 = new child1();
        child2 t2 = new child2();

        t2.start();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ini dari main");
    }
}
