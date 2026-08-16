package HW_4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[45];

        System.out.println("Згенерований масив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
            System.out.println(array[i] + " ");
        }
        System.out.println("/n");
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
    }
}
