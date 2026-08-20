package HW_6_1.Task2;

public class Car extends Vehicle {
    private int passangerCapacity;

    public Car(String name, int speed, int passangerCapacity) {
        super(name, speed);
        this.passangerCapacity = passangerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle" + name + "is moving at a " + speed + " of  km/h with " + passangerCapacity + " people on board");
    }
}
