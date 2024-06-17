package classes;

public class Generic<T> {
    private T data1;

    public Generic(T x) {
        this.data1 = x;
    }

    public T data1() {
        return data1;
    }
}