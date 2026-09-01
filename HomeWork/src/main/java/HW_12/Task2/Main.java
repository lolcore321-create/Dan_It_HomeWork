package HW_12.Task2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Tesla", 240, 60000, 4);
        Vehicle vehicle2 = null;
        Optional<Vehicle> optional1 = Optional.of(vehicle1);
        Optional<Vehicle> optional2 = Optional.ofNullable(vehicle2);
        System.out.println("isPresent: " + optional1.isPresent());
        System.out.println("isEmpty: " + optional1.isEmpty());
        System.out.println("get: " + optional1.get());
        Vehicle defaultVehicle = new Vehicle("Default", 0, 0, 0);
        System.out.println("orElse: " + optional1.orElse(defaultVehicle));

        System.out.println("orElseGet: " + optional1.orElseGet(() -> new Vehicle("FromSupplier", 0, 0, 0)));

        System.out.println("orElseThrow: " + optional1.orElseThrow(() -> new RuntimeException("Vehicle not found")));

        optional1.ifPresent(Vehcl -> System.out.println("ifPresent: " + Vehcl));

        optional1.ifPresentOrElse(Vehicl -> System.out.println("ifPresentOrElse (present): " + Vehicl),
                () -> System.out.println("ifPresentOrElse (empty): no vehicle")
        );
        System.out.println("map (name): " + optional1.map(Vehicle::getName).orElse("no name"));
        System.out.println("isPresent: " + optional2.isPresent());
        System.out.println("isEmpty: " + optional2.isEmpty());
        try {
            System.out.println("get: " + optional2.get());
        } catch (Exception e) {
            System.out.println("get threw exception: " + e.getMessage());
        }

        System.out.println("orElse: " + optional2.orElse(defaultVehicle));

        System.out.println("orElseGet: " + optional2.orElseGet(() -> new Vehicle("FromSupplier", 0, 0, 0)));

        try {
            System.out.println("orElseThrow: " + optional2.orElseThrow(() -> new RuntimeException("Vehicle not found")));
        } catch (RuntimeException ex) {
            System.out.println("orElseThrow threw exception: " + ex.getMessage());
        }

        optional2.ifPresent(Vehicl -> System.out.println("ifPresent: " + Vehicl));

        optional2.ifPresentOrElse(
                Vehicl -> System.out.println("ifPresentOrElse (present): " + Vehicl),
                () -> System.out.println("ifPresentOrElse (empty): no vehicle")
        );

        System.out.println("map (name): " + optional2.map(Vehicle::getName).orElse("no name"));
    }
}