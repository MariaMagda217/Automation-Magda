package curs.GroupExercise15Ap;

class Plane extends Transport {

    public Plane(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("The plane flies through the sky at " + speed + " km/h.");
    }

    public void deployLandingGear() {
        System.out.println("Landing gear deployed.");
    }
}
