package Game;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomKilklersDBD {
    public static void main(String[] args) {
        List<String> killers = Arrays.asList(
                "Trapper",
                "Wraith",
                "Hillbilly",
                "Nurse",
                "Huntress",
                "Mikel Miers",
                "Doctor",
                "Ghost Face",
                "Demigirgon");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Натисни [Enter], щоб обрати вбивцю(Або введи 'Пісюн' для виходу):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Пісюн")) {
                System.out.println("На крюк Всіх!");
                break;
            }
            int randomIndex = random.nextInt(killers.size());
            System.out.println("Твій Ман " + killers.get(randomIndex));
            System.out.println("Натисни [Enter] для наступного ролу(Або 'Пісюн':");
        }
        scanner.close();
    }
}
