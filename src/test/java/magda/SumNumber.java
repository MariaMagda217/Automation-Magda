package magda;

public class SumNumber {
    private int nr1;
    private int nr2;
    private int suma;

    public SumNumber(int nr1, int nr2) {
        this.nr1 = nr1;
        this.nr2 = nr2;
    }

    public int getNr1() {
        return nr1;
    }

    public void setNr1(int nr1) {
        this.nr1 = nr1;
    }

    public int getNr2() {
        return nr2;
    }

    public void setNr2(int nr2) {
        this.nr2 = nr2;
    }

    public int sumaNumerelor() {
        suma = nr1 + nr2;
        return suma;
    }
}
