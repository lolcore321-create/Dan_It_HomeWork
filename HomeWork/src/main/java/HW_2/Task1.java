package HW_2;

public class Task1 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1.length());
        String string2 = string1.substring(0,35);
        String string3 = string2.replace("i want", "dont want") + "it is perfect";
        System.out.println("string1: \"" + string1 + "\"");
        System.out.println("50 " + string1.length() + "\n");
        System.out.println("string2: \"" + string2 + "\"");
        System.out.println("35: " + string2.length() + "\n");

        System.out.println("string3: \"" + string3 + "\"");
        System.out.println("51" + string3.length());
    }
}