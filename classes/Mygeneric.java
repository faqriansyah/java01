package classes;

public class Mygeneric<T> {
    private T data;
    
    public Mygeneric(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    

}