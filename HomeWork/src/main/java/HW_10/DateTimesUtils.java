package HW_10;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimesUtils {
    public static void printCurrentDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedData = localDateTime.format(formatter);
        System.out.println(formattedData);
    }

    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {
        return dateTime.plusDays(days).plusHours(hours);
    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        int days = (int) duration.toDays();
        int hours = (int) duration.toHours() % 24;
        int minutes = (int) duration.toMinutes() % 60;
        return "Difference: " + days + " days, " + hours + " hours, " + minutes + " ninute ";
    }
}
