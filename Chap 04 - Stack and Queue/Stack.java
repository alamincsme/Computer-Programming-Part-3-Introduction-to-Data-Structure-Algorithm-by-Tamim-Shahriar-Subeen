package data_structure_and_algorithm;

import java.util.Arrays;
import java.util.StringJoiner;

public class Stack {
    private final int STACK_MAX = 10;
    int top = 0 ;
    int [] stack  = new int[STACK_MAX];


    public void push (int item) {
        if (top < STACK_MAX) {
            stack[top] = item;
            top++ ;
        } else {
            System.out.println("Stack is full.");
        }
    }

    public int pop() {
        int item = 0 ;
        if (top <= 0) {
            System.out.println("Stack is empty.");
            return -1 ;
        } else {
            top = top - 1;
            item = stack[top] ;
        }
       return item;
    }


    public String toString() {
        StringJoiner joiner = new StringJoiner (",", "[" , "]");
        for (int i = 0 ; i < top ; i++) {
            int item = stack[i] ;
            joiner.add(String.valueOf(item));
        }
        return joiner.toString() ;
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);

        System.out.println(stack);
    }
}
