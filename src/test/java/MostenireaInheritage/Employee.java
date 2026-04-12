package MostenireaInheritage;

public class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public void work(String aplicatie) {
        System.out.println(this.name + "Lucreaza ca " + aplicatie + ".");
    }
}
