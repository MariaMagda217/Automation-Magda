package MostenireaInheritage;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void details() {
        System.out.println("Name: " + this.name + " : age" + this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
