package org.Magda0.mgd;

public class Metode {
    public static void main() {
        salut();
        ridicareLaPatrat(12.2);
        sumaADouaNumere(14, 15);
    }

    static void salut() {
        System.out.println("Salut!");
    }

    static void ridicareLaPatrat(double numar) {
        System.out.println(numar * numar);
    }

    static void sumaADouaNumere(int x, int y) {
        System.out.println(x + y);
    }
}
