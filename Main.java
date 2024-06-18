import classes.*;

public class Main {
    public static void main(String[] args) {
        Mygeneric mygen = new Mygeneric<String>("lalalala");
        generate(mygen);
        
    }

    public static void generate(Mygeneric<? extends Object> data) {
        System.out.println(data.getData());
    }

}
