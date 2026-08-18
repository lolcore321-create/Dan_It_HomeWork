package HW_5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("Please, enter your name:");
        String name = scanner.nextLine();
        NumbersApplication numbersApplication = new NumbersApplication(name);
        numbersApplication.startGame(scanner);
        scanner.close();
    }
}
