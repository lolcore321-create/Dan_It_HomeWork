package HW_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть максимальну місткість складу ");
        int capacity = scanner.nextInt();
        while (capacity > 0) {
            System.out.println("Скільки металу хочете здати? ");
            int weight = scanner.nextInt();
            if (weight < 5) {
                System.out.println("Склад не приймає метал вагою менше 5 кг");
            } else if (weight > capacity) {
                System.out.println("На складі не достатньо вільного місця!");
                System.out.println("Ви можете здати максимум " + capacity + "кг");
            } else {
                capacity -= weight;
                System.out.println("Метал успішно прийнято!");
                System.out.println("Залишилось вільного місця на складі:" + capacity + "кг");
            }
        }
        System.out.println("Вільного місця не залишилось на складі");
    }
}
