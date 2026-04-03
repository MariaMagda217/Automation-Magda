package Tema7;

//5. Creează clasa ShoppingCart:
//Atribute:
// •	totalPrice
//Metode:
// • addProduct(double price)
// • removeProduct(double price)
// • getTotal()
//Reguli:
// • totalPrice nu poate deveni negativ
//În main:
// • adaugă 3 produse
// • șterge unul
// • afișează totalul

public class ShoppingCart {
    double totalPrice = 0;

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(20.5);
        cart.addProduct(15.0);
        cart.addProduct(40.0);

        cart.removeProduct(15.0);
        System.out.println("Total: " + cart.getTotal());
    }

    public void addProduct(double price) {
        totalPrice += price;
    }

    public void removeProduct(double price) {
        if (totalPrice - price >= 0) {
            totalPrice -= price;
        } else {
            totalPrice = 0;
        }
    }

    public double getTotal() {
        return totalPrice;
    }

}
