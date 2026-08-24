package HW_8.Task3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("We add elements to the queue through offer(): ");
        queue.offer("Ivan");
        queue.offer("Petro");
        queue.offer("Olha");
        System.out.println(queue);
        System.out.println("Let's look at the first element through peek() (Without removal):");
        System.out.println(queue.peek());
        System.out.println("We retrieve and remove the first element using poll():");
        System.out.println(queue.poll());
        System.out.println("Current queue: " + queue);
        System.out.println("Adding another element using add():");
        queue.add("Sofia");
        System.out.println(queue);
        System.out.println("Removing the first element using remove():");
        System.out.println(queue.remove());
        System.out.println("Current queue: " + queue);
        System.out.println("Checking the size using size():");
        System.out.println(queue.size());
        System.out.println("Checking if the queue is empty using isEmpty():");
        System.out.println(queue.isEmpty());
    }
}
