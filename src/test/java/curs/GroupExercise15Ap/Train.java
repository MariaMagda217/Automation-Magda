package curs.GroupExercise15Ap;

class Train extends Transport {

    public Train(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("The train glides on rails at " + speed + " km/h.");
    }

    public void openDoors() {
        System.out.println("Train doors are opening.");
    }
}
