package HW_6_1.Task3;

public class Video extends Media {
    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Playing video " + title + " at " + resolution + " resolution");
    }
}
