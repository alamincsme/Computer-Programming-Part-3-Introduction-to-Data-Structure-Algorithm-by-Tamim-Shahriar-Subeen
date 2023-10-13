package data_structure_and_algorithm;

import java.util.Scanner;

public class Solution_04 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int  n ;

        boolean [] even = new boolean[101];

        for (int i = 0 ; i < 101; i ++) {

            even[i] = true ;
        }

        for (int i = 1 ; i < 101; i = i + 2 ) {

            even[i] = false ;
        }

        n = scanner.nextInt() ;

        scanner.close();

       if (even[n]) {

           System.out.println(n + " is even number.");

       } else {

           System.out.println(n + " is odd number.");
       }

    }
}

// time complexity O ( n )