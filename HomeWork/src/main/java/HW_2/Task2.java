package HW_2;

public class Task2 {
    public static void main(String[] args) {
String Hardcore = "Testing, is my favourite job";
String[] words = Hardcore.replace(",", "").split("" + " ");
int firstWordLenght = words[0].length();
boolean isFirstLongest = true;
for (int i = 0; i < words.length; i++) {
String word = words[i];
int length = word.length();
System.out.println("Testing" + (i + 1) +" = " + word + ",, 7 = " + length + "." );
if (i > 0 && length >= firstWordLenght) {
isFirstLongest = false;
    }
    }
        System.out.println(isFirstLongest);
    }
}