package threads;

public class daemon extends Thread {
    public void run() {
        while(true) {
            System.out.println("Im a Fcking daemon");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}
