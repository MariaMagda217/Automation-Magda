package org.Magda0.mgd;

import org.junit.Test;

public class TriedMgd {
    static void example2() {
        int x = 10;
        int i = 0;
        do {
            System.out.println("iteratia" + 1);
            i++;
        } while (i < x);
    }

    @Test
    public void example() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("iteratia" + i);
        }
    }

    public void example1() {
        int x = 10;
        int i = 0;
        while (i < x) {
            System.out.println("iteratia" + i);
            i++;
        }
    }
}
