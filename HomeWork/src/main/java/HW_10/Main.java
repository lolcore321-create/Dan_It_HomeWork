package HW_10;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DateTimesUtils.printCurrentDateTime();

        System.out.println(DateTimesUtils.calculateFutureDateTime(
                LocalDateTime.of(2026, 8, 25, 14, 30), 3, 5));

        System.out.println(DateTimesUtils.isWeekend(
                LocalDateTime.of(2026, 8, 28, 10, 0)));

        System.out.println(DateTimesUtils.formatDateTime(
                LocalDateTime.of(2026, 8, 25, 14, 30), "dd-MM-yyyy HH:mm"));

        System.out.println(DateTimesUtils.calculateDifference(
                LocalDateTime.of(2026, 8, 25, 14, 30),
                LocalDateTime.of(2026, 8, 28, 16, 45)));
    }
}
