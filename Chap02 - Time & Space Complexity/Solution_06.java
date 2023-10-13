package data_structure_and_algorithm;

import java.util.Scanner;

public class Solution_06 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i, j, k, n,  count;

        n = scanner.nextInt();

        scanner.close();

        count = 0 ;

        for ( i = 0; i < n; i++) {

            for (j = 0; j < n; j ++) {

                for (k = 0; k < n; k++) {

                    count = count + 1 ;
                }
            }
        }

        System.out.println("n = " + n + ", count = " + count);
    }
}
//        input :
//        10
//        n = 10, count = 1000

//time complexity O ( n ^ 3)
