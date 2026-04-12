package Tema8.Exercise5;

public class CourseMain5 {
    public static void main(String[] args) {

        OnlineCourse5 oc = new OnlineCourse5("Automation", 20, "ItSchool");
        System.out.println("Course: " + oc.getCoursName());
        System.out.println("Duration: " + oc.getDuration() + " hours");
        System.out.println("Platform: " + oc.getPlatform());
    }
}


