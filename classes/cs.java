package classes;

public class cs {
    private String product;
    @SuppressWarnings("unused")
    private int price;
    public cs(String x, int y) {
        this.product = x;
        this.price = y;
    }

    public String getPrd() {
        return this.product;
    }
}
