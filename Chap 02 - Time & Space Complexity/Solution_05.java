package data_structure_and_algorithm;

import java.util.Scanner;

public class Solution_05 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, j, n, count;

        n = scanner.nextInt() ;

        count = 0 ;

        for ( i = 0 ;i < n ; i++) {

            for (j = 0 ; j < n ; j ++) {

                count = count + 1 ;
            }
        }

        System.out.println("n = " + n + " , count = "+ count);
    }
}
//         input :
//         10
//         n = 10 , count = 100

// Time complexity O(n ^ 2 )
