import classes.NotGeneric;

public class Main {
    public static void main(String[] args) {
        NotGeneric ng = new NotGeneric();
        ng.setData(555);
        int val = (int) ng.getData();
        System.out.println(val);
    }
}
