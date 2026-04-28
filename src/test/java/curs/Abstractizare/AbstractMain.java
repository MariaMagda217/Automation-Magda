package curs.Abstractizare;

public class AbstractMain {
    public static void main(String[] args) {
        Circle circle = new Circle();

        int ariaCerc = circle.calculateArea(13, 0);
        System.out.println("Aria cerc: " + ariaCerc);


        Rectangle dreptunghi = new Rectangle();

        int arieDreptunghi = dreptunghi.calculateArea(4, 5);
        System.out.println(arieDreptunghi);
        String drawCircle = circle.draw();
    }
}
