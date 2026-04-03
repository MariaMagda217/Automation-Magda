package Tema7;

//4. Creează clasa Employee:
//Atribute:
//•	name
//•	salary
//Metode:
// • constructor cu parametri
// • increaseSalary(double percent)
// • getSalary()
//În main:
//•	creează 2 angajați
// • crește salariul unuia
// • afișează rezultatul

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Amalia ", 3000);
        Employee e2 = new Employee("John ", 2800);

        e2.increaseSalary(10);

        e1.display();
        e2.display();
    }

    public void increaseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println(name + " Salary: " + salary);
    }
}



