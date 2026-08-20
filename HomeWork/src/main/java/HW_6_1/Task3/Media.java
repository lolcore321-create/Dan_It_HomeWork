package HW_6_1.Task3;

public class Media {
    public String title;
    public int duration;
    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    public void play() {
        System.out.println("Multimedia playback");
    }
}
