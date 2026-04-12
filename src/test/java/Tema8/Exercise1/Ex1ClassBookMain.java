package Tema8.Exercise1;

public class Ex1ClassBookMain {
    public static void main(String[] args) {
        Ex1ClassBook b = new Ex1ClassBook();

        b.setTitle("Title: Cat on the Run");
        b.setAuthor("Author: Aaron Blabey");

        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
    }
}

