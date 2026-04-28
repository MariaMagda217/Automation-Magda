package curs.GroupExercise15Ap;

public class Transport {
    protected int speed;

    public Transport(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("The transport is moving at " + speed + "km/h");
    }
}
