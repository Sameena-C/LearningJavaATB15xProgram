package ex_29_Collection_Framework.CF_03_QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LabLinkedAsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(1);
        queue.add(8);
        System.out.println(queue);// [6, 1, 8] maintains insertion order

        System.out.println(queue.peek()); //6 - prints the first element in the queue
        System.out.println(queue); // [6, 1, 8]

        System.out.println(queue.poll()); //6- Removes the first element in the queue
        System.out.println(queue); //[1, 8]

        System.out.println("-----------------------------");
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext())
        {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
