package curs.GroupExercise15Ap;

public class Car extends Transport {

    public Car(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("The car drives smoothly at " + speed + " km/h.");
    }

    public void honk() {
        System.out.println("Car says: Beep beep!");
    }
}

