package data_structure_and_algorithm;

import java.util.Map;
import java.util.StringJoiner;

public class Circular_Queue {
    private final int MAX_QUEUE_SIZE = 5;
    int head, tail;
    int [] Q = new int[MAX_QUEUE_SIZE + 1];

    public void Enqueue(int item) {
        if ((tail + 1) % (MAX_QUEUE_SIZE + 1) == head) {
            System.out.println("Queue is full.");
            return;
        } else {
            Q[tail] = item;
            tail = (tail + 1) % (MAX_QUEUE_SIZE + 1) ;
        }
    }

    public int Dequeue () {
        int item = 0 ;
        if (head == tail) {
            System.out.println("Queue is empty.");
            return  -1;
        } else {
            item = Q[head];
            head = (head + 1) % ( MAX_QUEUE_SIZE + 1);
        }
        return item;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (int i = head; i < tail ; i++) {
            int item = Q[i] ;
            joiner.add(String.valueOf(item));
        }
        return joiner.toString() ;
    }


    public static void main(String[] args) {
      Circular_Queue q = new Circular_Queue() ;

      q.Enqueue(10);
      q.Enqueue(20);
      q.Enqueue(30);

      System.out.println(q);

      q.Dequeue();
      q.Dequeue();
      System.out.println(q);

      q.Dequeue();
      System.out.println(q);

      q.Dequeue();
      

    }
}
