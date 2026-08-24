package HW_8.Task3;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMain {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        System.out.println("We are adding the first element through addFirst():");
        deque.addFirst("Nina");
        System.out.println(deque);
        System.out.println("We are adding the final element through addLast():");
        deque.addLast("Victor");
        System.out.println(deque);
        System.out.println("We return the first element of the collection through peekFirst():");
        deque.peekFirst();
        System.out.println(deque.peekFirst());
        System.out.println("We return the last element of the collection through peekLast():");
        deque.peekLast();
        System.out.println(deque.peekLast());
        System.out.println("We get the first element and delete it through pollFirst():");
        deque.pollFirst();
        System.out.println(deque.pollFirst());
        System.out.println("We get the last element and delete it through pollLast():");
        deque.pollLast();
        System.out.println(deque.pollLast());
    }
}
