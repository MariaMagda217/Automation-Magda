package Tema8.Exercise7;

//Exercițiul 7 –protected vs private
// Creează:-Order →protected orderId +
//metodă printOrder()
//OnlineOrder extinde
//Order → metodă trackOrder()
//testează accesul la orderId

public class Order {
    protected int orderId;

    public void printOrder() {
        System.out.println("Print order ID " + orderId);
    }
}
