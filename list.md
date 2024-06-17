    
    
public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("Outside of");
    }
    public void run() {
        System.out.println("Running in a thread");
    }