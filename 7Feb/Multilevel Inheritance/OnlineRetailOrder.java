class Order {
    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void getOrderStatus() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + ", Status: Placed");
    }
}
class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber + ", Status: Shipped");
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate + ", Status: Delivered");
    }
}
public class OnlineRetailOrder {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(12345, "2025-02-07", "TRK98765", "2025-02-10");
        order.getOrderStatus();
    }
}
