package HW_8.Task2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Person people1 = new Person("Dima", "Petrenco", 25);
        Person people2 = new Person("Anton", "Shevchenko", 33);
        Person people3 = new Person("Vika", "Semerenko", 27);
        Person people4 = new Person("Olha", "Olegivna", 22);
        Person people5 = new Person("Olha", "Olegivna", 22);
        Person people6 = new Person("Anton", "Shevchenko", 33);
        people.add(people1);
        people.add(people2);
        people.add(people3);
        people.add(people4);
        people.add(people5);
        people.add(people6);
        System.out.println(people);
        System.out.println("Size Set: " + people.size());
        System.out.println("Is there Dima Petrenco: " + people.contains(people1));
        people.remove(people3);
        System.out.println("After removal Vika: " + people);
        System.out.println("Empty list? " + people.isEmpty());
        for (Person p : people) {
            System.out.println("Through: " + p);
        }
        people.removeIf(p -> p.getAge() > 30);
        System.out.println("After deletion over 30: " + people);
    }
}
