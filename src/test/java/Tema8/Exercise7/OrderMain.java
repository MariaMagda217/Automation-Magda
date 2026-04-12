package Tema8.Exercise7;

public class OrderMain {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder();
        order.orderId = 7753;

        order.printOrder();
        order.trackOrder();
    }
}
