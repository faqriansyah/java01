import classes.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.progressOrder().completeOrder().cancelOrder().getStatus());
    }
}