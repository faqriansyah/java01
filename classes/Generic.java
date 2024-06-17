package classes;

public class Generic<T> {
    public Generic(T x) {
        if(x instanceof String) {
            System.out.println("This  data is a String");
        } else if (x instanceof Integer) {
            System.out.println("This data is a Integer");
        } else {
            System.out.println("What the hell is that");
        }
    }
}