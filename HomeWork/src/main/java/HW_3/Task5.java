package HW_3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число");
        int a = scanner.nextInt();

        System.out.println("Введіть друге число");
        int b = scanner.nextInt();

        System.out.println("Введіть символ (+, %, /, *)");
        char op = scanner.next().charAt(0);

        int result;

        if (op == '+') {
            result = a + b;
        } else if (op == '%') {
            result = a % b;
        } else if (op == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                result = 0;
            }
        } else if (op == '*') {
            result = a * b;
        } else {
            result = 0;
        }

        System.out.println("Результат: " + result);
    }
}


