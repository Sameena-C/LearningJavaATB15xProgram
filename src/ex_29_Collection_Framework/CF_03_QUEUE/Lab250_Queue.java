package ex_29_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab250_Queue {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
         // FIFO

        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q); // natural sorting [Dutta, Pramod]

        System.out.println(q.peek()); //Dutta - prints the first element in the queue
        System.out.println(q); // [Dutta, Pramod]

        System.out.println(q.poll()); //Dutta - Removes the first element in the queue
        System.out.println(q); //[Pramod]
    }
}
