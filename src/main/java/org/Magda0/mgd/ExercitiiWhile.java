package org.Magda0.mgd;

public class ExercitiiWhile {
    public static void main (String [] args) {
        printWhileUp();
        printWhileDown();
        printEvenNumber();
        int sum = sumNumbers();
        System.out.println("Suma este: " + sum);
    }

    private static int sumNumbers() {
        int y = 1;
        int sum = 0;
        while (y <= 5) {
            sum = sum + y;
            y++;
        }
        return sum;
    }

    private static void printEvenNumber() {
        int k = 1;
        while (k <= 30) {
            if (k % 3 == 0) {

                System.out.println(k);
            }
            k++;
        }
    }

    private static void printWhileDown() {
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
    }

    private static void printWhileUp() {
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }
    }
}
