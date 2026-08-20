package HW_6_2.Task2;

public class UpperCaseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}
