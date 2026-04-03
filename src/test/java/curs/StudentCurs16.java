package curs;

public class StudentCurs16 {
    String name;
    int grade;

    public StudentCurs16(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void main(String[] args) {
        StudentCurs16 student1 = new StudentCurs16("Gratiela", 9);
        StudentCurs16 student2 = new StudentCurs16("Alex", 7);

        student1.isPassed();
        student2.isPassed();

        student2.setGrade(7);
        student2.getGrade(8);

    }

    public void isPassed() {
        if (grade >= 5) {
            System.out.println(this.name + " a trecut");
        } else {
            System.out.println(this.name + " nu a trecut ");
        }
    }

    public void setGrade(int newGrade) {
        this.grade = newGrade;
    }

    public void getGrade(int i) {
        System.out.println(this.grade);
    }
}
