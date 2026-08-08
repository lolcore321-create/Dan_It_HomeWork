package HW_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int a = scanner.nextInt();
        System.out.println("Введіть друге число");
        int b = scanner.nextInt();
        int core = (a > b) ? (a - b) : (b - a);
        System.out.println(core);
    }
}
