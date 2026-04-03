package curs;

public class Person {
    String name;
    int age;

    public Person(String nameParam) {
        this.name = nameParam;
    }

    public Person(String nameParam, int ageParam) {
        this.name = nameParam;
        this.age = ageParam;
    }

    public Person(int age) {

    }

    public static void main(String[] args) {
        Person p1 = new Person("Gratiela", 28);

        p1.name = "Anabella";
        p1.age = 38;

        Person p2 = new Person("Amalia", 9);
//        p2.name = "Amalia";
//        p2.age = 9;

        Person p3 = new Person("Catalin");

        Person p4 = new Person(26);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();
    }

    public void displayInfo() {
        System.out.println(this.name + " are " + this.age + " ani ");
    }
}
