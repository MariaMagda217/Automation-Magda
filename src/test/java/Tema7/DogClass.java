package Tema7;

//1. Creează clasa Dog:
//Atribute:
//•	name
//• age
//Metode:
//• bark() → afișează: „Câinele <name> latră”
//•	getAgeInHumanYears() → returnează age * 7
//În main:
//•	creează 2 obiecte
//•	apelează metodele

public class DogClass {
    private final String name;
    private final int age;

    public DogClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        DogClass dog1 = new DogClass("Hailey", 2);
        DogClass dog2 = new DogClass("Simba", 1);

        dog1.bark();
        System.out.println(dog1.name + " age in human years " + dog1.getAgeInHumanYears());

        dog2.bark();
        System.out.println(dog2.name + " age in human years " + dog2.getAgeInHumanYears());
    }

    public void bark() {
        System.out.println(" The dog " + name + " barks.");
    }

    public int getAgeInHumanYears() {
        return age * 7;
    }
}



