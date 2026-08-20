package HW_6_2.Task2;

public interface TextProcessor {
    String process(String text);

    default String removeDigits(String text) {
        return text.replace(".", "");
    }
}
