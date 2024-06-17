import classes.*;

public class Main extends Annotation {

    @Override public void SayHi() {
        System.out.println("Halo Gaes");
    }
    
    public static void main(String[] args) {
        new Main().SayHi();
        tes();
    }
}

