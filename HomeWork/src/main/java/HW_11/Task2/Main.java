package HW_11.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Anton", "Antonovich", 33, 25000);
        Person person2 = new Person("Vika", "Korolenko", 23, 20000);
        Person person3 = new Person("Lida", "Galushko", 71, 2300);
        Person person4 = new Person("Viktor", "Viktorovich", 19, 13000);
        Person person5 = new Person("Igor", "Igorovich", 74, 3200);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        System.out.println(persons);
        List<String> namesUnder70 = persons.stream()
                .filter(person -> person.getAge() < 70)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(namesUnder70);
    }
}
