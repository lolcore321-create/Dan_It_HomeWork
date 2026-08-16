package HW_4;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];
        System.out.println("Згенерований массив");
        for (int i = 0; i < args.length; i++) {
            array[i] = random.nextInt(50) + 1;
            System.out.println(array[i] + " ");
        }
        System.out.println();
        System.out.println("Введіть число для пошуку': ");
        int target = scanner.nextInt();
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                isFound = true;
                break;
            }
            if (isFound) {
                System.out.println("Число " + target + " є у цьому масиві!");
            } else {
                System.out.println("Числа " + target + " немає у цьому масиві.");
            }

            scanner.close();
        }
    }
}