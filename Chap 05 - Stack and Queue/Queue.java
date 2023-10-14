package data_structure_and_algorithm;

import java.util.StringJoiner;

public class Queue {
    private final int QUEUE_MAX_SIZE = 10;
    int head, tail;
    int Queue[] = new int[QUEUE_MAX_SIZE];

    public void enQueue (int item) {
        if (head < QUEUE_MAX_SIZE) {
            Queue[head] = item;
            head++;
        } else {
            System.out.println("Queue is full.");
        }
    }

    public int deQueue () {
        int item = 0;
        if (head <= 0) {
            System.out.println("Queue is empty.");
        } else {
            item = Queue[tail];
            tail = tail + 1 ;
        }
        return item;
    }

    public String toString () {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (int i = tail; i < head ; i ++) {
            int item = Queue[i];
            joiner.add(String.valueOf(item));
        }

        return joiner.toString() ;
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);

        System.out.println(q);


        q.deQueue();
        System.out.println(q);
    }
}
