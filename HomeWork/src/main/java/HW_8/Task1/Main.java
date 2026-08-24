package HW_8.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Person> people = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the command: addPerson / getPerson / exit");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("addPerson")) {
                addPerson();
            } else if (command.equalsIgnoreCase("getPerson")) {
                getPerson();
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("The program is shutting down.");
                break;
            } else {
                System.out.println("Unknown command; please try again.");
            }
        }
    }

    private static void addPerson() {
        System.out.println("Enter your surname");
        String surname = scanner.nextLine();
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter you age");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: age must be a number, try again");
            scanner.next();
        }
        int age = scanner.nextInt();
        scanner.nextLine();
        String key = surname.toUpperCase();
        if (people.containsKey((key))) {
            System.out.println("A person with that surname does not exist. Replace? Yes/no?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Yes")) {
                people.put(key, new Person(name, surname, age));
            } else {
                people.put(key, new Person(name, surname, age));
            }
        }
        }
        private static void getPerson() {
        System.out.println("Enter a surname to search");
        String key = scanner.nextLine().toUpperCase();
        if (people.containsKey(key)) {
            System.out.println(people.get(key));
        } else if (people.isEmpty()) {
            System.out.println("The list of people is empty.");
        } else {
            System.out.println("There is no such surname. Available surnames: ");
            for (String k : people.keySet()) {
                System.out.println(k);
            }
        }
        }

}
