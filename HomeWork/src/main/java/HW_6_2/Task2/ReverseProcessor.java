package HW_6_2.Task2;

public class ReverseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
