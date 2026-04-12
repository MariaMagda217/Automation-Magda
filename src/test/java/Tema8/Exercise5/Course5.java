package Tema8.Exercise5;

//Exercițiul 5 –Constructor +Moștenire
//Creează:
// -Course → private courseName,duration +constructor
//OnlineCourse extinde Course →
// atribut platform
//creează obiect și afișează datele

public class Course5 {
    private final String coursName;
    private final int duration;

    public Course5(String coursName, int duration) {
        this.coursName = coursName;
        this.duration = duration;
    }

    public String getCoursName() {
        return coursName;
    }

    public int getDuration() {
        return duration;
    }
}
