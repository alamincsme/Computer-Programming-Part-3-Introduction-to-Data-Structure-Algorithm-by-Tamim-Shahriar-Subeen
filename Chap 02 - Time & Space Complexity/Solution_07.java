package data_structure_and_algorithm;

import java.util.Scanner;

public class Solution_07 {
    static int i , j , n , count ;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        n = scanner.nextInt();

        scanner.close();

        for (int i = 0 ; i < n ; i ++) {

            for (j = 0 ; j < n ; j++) {         // Time complexity O(n ^ 2);

                count = count + 1 ;
            }
        }

        for (int i = 0 ; i < n ; i++) {

            count = count = 1 ;                // time complexity O(n);
        }

        System.out.println("n = " + n + " , Count = " + count);
    }
}
// Total Time complexity n ^ 2 + n ;
//Time complexity On (n ^ 2 )