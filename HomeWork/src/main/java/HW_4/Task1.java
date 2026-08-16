package HW_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("Вводьте слова по черзі (Для завершення пропрозиції введіть Stop):");
        String world = scanner.next();
        while (!world.equals("Stop")) {
            result += world + " ";
            world = scanner.next();
            System.out.println("Зібрана пропозиція" + result.trim());
        }
    }
}