package HW_9.Task3;

public class AnimalFactory {
    public Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (type.equalsIgnoreCase("bird")) {
            return new Bird();
        } else {
            throw new IllegalArgumentException("Unknown animal type " + type);
        }
    }
}
