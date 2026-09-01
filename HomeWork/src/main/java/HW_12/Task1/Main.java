package HW_12.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("Select an operation: +-*/ (or Exit to quit");
            String operation = scanner.nextLine();
            if (operation.equals("Exit")) {
                break;
            }
            try {
                double a = readNumber(scanner, "Enter the first number: ");
                double b = readNumber(scanner, "Enter the second number: ");
                double result;
                switch (operation) {
                    case "+":
                        result = calculator.add(a, b);
                        break;
                    case "-":
                        result = calculator.subtract(a, b);
                        break;
                    case "*":
                        result = calculator.multiply(a, b);
                        break;
                    case "/":
                        result = calculator.divide(a, b);
                        break;
                    default:
                        System.out.println("Unknown operation");
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (DivisionbyZeroException | InvalidNumberException ex) {
                System.out.println(ex.getMessage());
            } catch (Exception ex) {
                System.out.println("An unknown error occurred");
            }
        }
    }

    private static double readNumber(Scanner scanner, String prompt) throws InvalidNumberException {
        System.out.println(prompt);
        String input = scanner.nextLine();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException ex) {
            throw new InvalidNumberException("Error: You entered a non-numeric value. Please try again.");
        }
    }
}