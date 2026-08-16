package HW_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] name = {
            "Пєтя", "Маша", "Олена", "Саша", "Антон", "Гліб", "Фєдя"
        } ;
        int[] time = {
            10, 12, 14, 16, 18, 20
        } ;
        String[] places = {
            "Школу", "Магазин", "тренажерний зал", "кіно", "поліклініку"
        } ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть три числа(Для імені, часу, та місця):");
        int nameIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();
        if (nameIndex >= 0 && nameIndex < name.length &&
                timeIndex >= 0 && timeIndex < time.length &&
                placeIndex >= 0 && placeIndex < places.length) {
            System.out.println(name[nameIndex] + " буде йти в/до " + places[placeIndex] + " о " + time[timeIndex] + ":00");
        } else {
            System.out.println("Помилка при введенні числа виходить за межі доступних");
        }
        scanner.close();
    }
}

