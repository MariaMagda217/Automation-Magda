package org.Magda0.mgd;

public class MetodaReturn {
    public static void main() {
        int sum = sum(5);
        System.out.println("Dumblul numarului 5: " + sum);

        boolean isEven = isEven(8);
        System.out.println("Numarul este par? " + isEven);

        int sumN = sumN(23);
        System.out.println("Suma numerelor este: " + sumN);

        String timesTable = timesTable(7);
        System.out.println(timesTable);

        int multiplu = primulMultiplu();
        System.out.println("Primul multiplu " + multiplu);

        String mesaj = mesajFormatat("Magda", 30);
        System.out.println(mesaj);

        int adunare = adunare(3, 5);
        int scadere = scadere(10, 3);
        int inmultire = inmultire(5, 4);
        double impartire = impartire(15, 2);
        System.out.println("adunare " + adunare);
        System.out.println("scadere " + scadere);
        System.out.println("inmultire " + inmultire);
        System.out.println("impartire " + impartire);

        String numerePare = evenNr(5, 20);
        System.out.println(numerePare);

        int fact = factorial(9);
        System.out.println("factorialul este: " + fact);

        boolean nrPrim = estePrim(14);
        System.out.println(nrPrim);

    }

    public static int sum(int a) {
        return a * 2;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static String timesTable(int a) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += a + " x " + i + " = " + (a * i) + "\n";
        }
        return result;

    }

    private static int primulMultiplu() {
        int n = 100;
        int rezultat = ((n / 7) + 1) * 7;
        return rezultat;
    }

    private static String mesajFormatat(String nume, int varsta) {
        return "Numele este " + nume + " si are " + varsta + " ani ";
    }

    private static int adunare(int a, int b) {
        return a + b;
    }

    private static int scadere(int a, int b) {
        return a - b;
    }

    private static int inmultire(int a, int b) {
        return a * b;
    }

    private static double impartire(int a, int b) {
        return (double) a / b;
    }

    private static String evenNr(int a, int b) {
        String numerePare = "";
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                numerePare += i + ", ";
            }

        }
        return numerePare;
    }

    public static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;

    }

    public static boolean estePrim(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;

            }
        }

        return true;
    }
}




