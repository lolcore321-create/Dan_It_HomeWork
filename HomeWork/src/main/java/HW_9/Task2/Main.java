package HW_9.Task2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = Vehicle.getInstance();
        vehicle1.setName("BMW");
        vehicle1.setSpeed(250);
        vehicle1.setPrice(55000.5);
        Vehicle vehicle2 = Vehicle.getInstance();
        Vehicle vehicle3 = Vehicle.getInstance();
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
        System.out.println("Hash in vehicle1 " + vehicle1.hashCode());
        System.out.println("Hash in vehicle2 " + vehicle2.hashCode());
        System.out.println("Hash in vehicle3 " + vehicle3.hashCode());
    }
}
