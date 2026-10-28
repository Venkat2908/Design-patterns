package Assignments.Strategy.Assignment2;

public class Videomain {
    public static void main(String[] args) {
        Videomanager v1 = new Videomanager();

        Video video = new Video("venkat/wound", VideoQuality.HIGH);
        Video results = v1.createvideo(video);

        System.out.println(results.toString());
    }
}