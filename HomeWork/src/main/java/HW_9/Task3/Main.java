package HW_9.Task3;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal animal1 = factory.createAnimal("dog");
        Animal animal2 = factory.createAnimal("cat");
        Animal animal3 = factory.createAnimal("bird");

        animal1.speak();
        animal2.speak();
        animal3.speak();
    }
}
