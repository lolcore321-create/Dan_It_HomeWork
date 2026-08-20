package HW_6_1.Task2;

public class Vehicle {
    public String name;
    public int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;

    }

    public void move() {
        System.out.println("The vehicle is moving at a speed of X km/h.");
    }

    public void stop() {
        System.out.println("Transport" + name + "has stopped.");
    }
}