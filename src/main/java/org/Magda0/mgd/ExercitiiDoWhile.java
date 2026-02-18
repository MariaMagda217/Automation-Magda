package org.Magda0.mgd;

public class ExercitiiDoWhile {
    public static void main(String[] args) {
        printDoWhileUp();
        printDoWhileDown();

        int sum = getSum();

        System.out.println("Suma este: " + sum);
    }

    private static int getSum() {
        int y = 1;
        int sum = 0;
        do {
            sum = sum + y;
            y++;
        } while (y <= 5);
        return sum;
    }

    private static void printDoWhileDown() {
        int x = 10;
        do {
            System.out.println(x);
            x--;
        } while (x >= 1);
    }

    private static void printDoWhileUp() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}





