package HW_6_1.Task3;

public class Music extends Media {
    private String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Now playing " +  artist +  title);
    }
}
