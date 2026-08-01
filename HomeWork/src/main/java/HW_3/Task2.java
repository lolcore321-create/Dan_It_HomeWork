package HW_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше значення");
        int a = scanner.nextInt();
        System.out.println("Введіть друге значення");
        int b = scanner.nextInt();
        System.out.println("Введіть третє значення");
        int c = scanner.nextInt();
        if (a > 0 && b > 0 && c > 0 &&
            (a + b > c) && (a + c > b) && (b + c > a) ) {
            System.out.println("З цих сторін пожна побудувати трикудник");
        }
    }
}
