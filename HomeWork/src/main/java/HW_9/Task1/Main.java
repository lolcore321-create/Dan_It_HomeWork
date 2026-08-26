package HW_9.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new  ArrayList<>();
        cars.add(new Car("Toyota", 180));
        cars.add(new Car("BMW", 220));
        cars.add(new Car("Tesla", 260));
        cars.add(new Car("Audi", 280));
        cars.add(new Car("Scoda", 170));
        System.out.println("To sorting :");
        System.out.println(cars);
        cars.sort(Comparator.comparingInt(Car::getSpeed));
        System.out.println("After sorting:");
        System.out.println(cars);
    }
}
