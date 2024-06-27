class Call {
    public Call go() {
        System.out.println("going...");
        return this;
    }
    public void stop() {
        System.out.println("stop...");
    }
}
public class Main {
    public static void main(String[] args) {
        Call call = new Call();
        call.go().stop();

    }
}