package org.Magda0.mgd;

import java.util.ArrayList;
import java.util.List;

public class ExercitiiFor {
    public static void main(String args[]) {
        printForUp();
        printForDown();
        execModulo();

        int sum = sumNumbers();

        System.out.println("Suma este: " + sum);
        forUsers();
    }

    private static void printForUp() {
        System.out.println("Execute for ++");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void printForDown() {
        System.out.println("Execute for --");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    private static void execModulo() {
        System.out.println("Execute modulo:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static int sumNumbers() {
        System.out.println("Sum of ++ ");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static void forUsers() {
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Bogdan");
        names.add("Carmen");
        names.add("Daniel");
        names.add("Elena");
        names.add("Magda");

        for(int i = 0 ; i < names.size(); i++) {
            System.out.println("Nume: " + names.get(i));
        }

    }
}

