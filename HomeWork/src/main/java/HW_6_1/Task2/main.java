package HW_6_1.Task2;

public class main {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen Tiguan", 120, 5);
        car.move();
        car.stop();
        Truck truck = new Truck("Bogdan", 60, 10.5);
        truck.move();
        truck.stop();
    }
}
