package data_structure_and_algorithm;

import java.util.Scanner;

public class Solution_03 {
    
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt() ;

        if (n % 2 == 0) {

            System.out.println(n + " is even number.");

        } else {

            System.out.println(n + " is odd number.");
        }

    }
}
// time complexity O ( 1 ).