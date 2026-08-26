package HW_9.Task4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("Tesla")
                .setPrice(80000.0)
                .setMaxSpeed(240)
                .setCountOfWheels(4)
                .build();
        System.out.println(car);
    }
}
