package HW_4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        String number = scanner.next();
        String cleanNumber = number.replace("_","");
        StringBuilder sb = new StringBuilder(cleanNumber);
        String reversedNumber = sb.reverse().toString();
        if (cleanNumber.equals(reversedNumber)) {
            System.out.println("Число" + number + " Є паліндромом");
        } else {
            System.out.println("Число" + number + " 6не є паліндромом");
        }
    }
}
