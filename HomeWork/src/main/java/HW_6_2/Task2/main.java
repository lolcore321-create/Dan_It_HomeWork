package HW_6_2.Task2;

public class main {
    public static void main(String[] args) {
        TextProcessor upper = new UpperCaseProcessor();
        System.out.println(upper.process("Hello, World!."));
        System.out.println(upper.removeDigits("Hello, World!."));

        TextProcessor reverse = new ReverseProcessor();
        System.out.println(reverse.process("Hello, World!."));
        System.out.println(reverse.removeDigits("Hello, World!."));

        TextProcessor trim = new TrimProcessor();
        System.out.println(trim.process("Hello, World!."));
        System.out.println(trim.removeDigits("Hello, World!."));
    }
}
