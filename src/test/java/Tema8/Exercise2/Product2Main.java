package Tema8.Exercise2;

public class Product2Main {
    public static void main(String[] args) {

        Product2 p = new Product2();
        p.setName("The product is: Phone");
        p.setPrice(1000);
        System.out.println(p.getName() + " costs £" + p.getPrice());
        p.setPrice(-500);
        System.out.println("Price after invalid attempt: " + p.getPrice());
    }

}
