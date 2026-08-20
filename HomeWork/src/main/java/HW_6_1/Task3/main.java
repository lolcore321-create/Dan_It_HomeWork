package HW_6_1.Task3;

public class main {
    public static void main(String[] args) {
        Media[] items = {
                new Music("Shape of You", 4, "Ed Sheeran"),
                new Video("Video game review", 15, "1920x1080")
        } ;
        for (Media m : items) {
            m.play();
        }
    }
}
