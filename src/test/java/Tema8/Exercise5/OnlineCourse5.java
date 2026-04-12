package Tema8.Exercise5;

public class OnlineCourse5 extends Course5 {
    private final String platform;

    public OnlineCourse5(String coursName, int duration, String itSchool) {
        super(coursName, duration);
        this.platform = itSchool;
    }

    public String getPlatform() {
        return platform;
    }
}
