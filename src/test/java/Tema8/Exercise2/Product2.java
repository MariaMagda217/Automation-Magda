package Tema8.Exercise2;

public class Product2 {

//    Exercițiul 2 – Encapsulare cu validare
//    Creează clasa Product:
//    - private name, price
//    - în setter pentru price: nu permite valori <= 0
//    - testează valori valide și invalide

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Must be >0.");
        }

    }

}
