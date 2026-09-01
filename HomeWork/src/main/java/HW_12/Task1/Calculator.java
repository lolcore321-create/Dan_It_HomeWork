package HW_12.Task1;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws DivisionbyZeroException {
        if (b == 0) {
            throw new DivisionbyZeroException("Error: Division by zero is impossible!");
        }
        return a / b;
    }
}
