package classes;

public class Order {
    private OrderStatus status;
    enum OrderStatus {
        NEW,
        IN_PROGRESS,
        COMPLETED,
        CANCELLED
    }

    public Order() {
        status = OrderStatus.NEW;
    }

    public Order progressOrder() {
        if(status == OrderStatus.NEW) {
            status = OrderStatus.IN_PROGRESS;
        }
        return this;
    }

    public Order completeOrder() {
        if(status == OrderStatus.IN_PROGRESS) {
            status = OrderStatus.COMPLETED;
        }
        return this;
    }

    public Order cancelOrder() {
        if(status != OrderStatus.COMPLETED) {
            status = OrderStatus.CANCELLED;
        } 
        return this;
    }

    public String getStatus() {
        return status.name();
    }
}
