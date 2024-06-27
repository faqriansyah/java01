package classes;

public class ThreadClass extends Thread {
    public static void main(String[] args) {
        ThreadClass thclass = new ThreadClass();
        System.out.println(thclass.isAlive());
        thclass.start();
    }

    public void start() {
        System.out.println("This is from thread");
    }
}
