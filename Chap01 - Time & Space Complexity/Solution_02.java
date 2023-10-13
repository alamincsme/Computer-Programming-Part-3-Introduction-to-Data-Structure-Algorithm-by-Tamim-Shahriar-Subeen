package data_structure_and_algorithm;

import java.util.Scanner;

public class Solution_02 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int result = 0 ;

        for (int i = 0; i <= n; i++ ) {

            result += result + i ;

        }
    }
}
// time complexity O ( n ) .