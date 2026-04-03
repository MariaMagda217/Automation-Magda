package curs;

public class Car {

    String brand = "VW";
    String model;
    int year;
    boolean isSport;


    // Constructor cu parametri
    public Car(String brand, String model, int year, boolean isSport) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isSport = isSport;
    }

    public Car(String brand, int year, boolean isSport) {

    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", "X5", 2020, true);
//        c1.brand = "BMW";
//        c1.model = "X5";
//        c1.year = 2020;
//        c1.isSport = true;

        Car c2 = new Car("VW", "Golf", 2010, false);
//        c2.brand = "VW";
//        c2.model = "Golf";
//        c2.year = 2010;
//        c2.isSport = false;

        c1.displayInfo();
        c2.displayInfo();

        System.out.println(c1.isOldCar());
        System.out.println(c2.isOldCar());

    }

    public void displayInfo() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        System.out.println(isSport);

//    public void displayInfo() {
//        System.out.println(brand);
//        System.out.println(model);
//        System.out.println(year);

        if (isSport) {
            System.out.println("Este masina sport" + isSport);
        } else {
            System.out.println("Nu este masina sport");
        }
    }

    public boolean isOldCar() {
        return year <= 2010;
    }
}
