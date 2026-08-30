package HW_11.Task1;

public class MyBrowser implements CanBeClosed {
    @Override
    public void close() {
        System.out.println("Browser closed");
    }
}
