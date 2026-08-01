package HW_2;

public class Task3 {
    public static void main(String[] args) {
        String over = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        System.out.println(over.split("[aA]").length - 1);
    }
    }
