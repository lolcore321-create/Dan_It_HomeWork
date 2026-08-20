package HW_6_1.Task2;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = (int) loadCapacity;
    }
    @Override
    public void move() {
        System.out.println("The vehicle " + name + " with a load capacity of " + loadCapacity + " is moving at a " + speed + " of  km/h.");
    }
}
