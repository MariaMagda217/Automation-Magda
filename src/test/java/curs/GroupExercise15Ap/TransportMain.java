package curs.GroupExercise15Ap;

public class TransportMain {
    public static void main(String[] args) {

        Car car = new Car(130);
        Train train = new Train(50);
        Plane plane = new Plane(900);

        car.move();
        car.honk();

        train.move();
        train.openDoors();

        plane.move();
        plane.deployLandingGear();
    }
}