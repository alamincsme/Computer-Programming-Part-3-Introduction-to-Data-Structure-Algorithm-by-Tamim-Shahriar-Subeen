package data_structure_and_algorithm;

import java.util.Scanner;

public class Soluton_01 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        int result = n * (n + 1)  / 2 ;      // O ( 1 ) time complexity .
        System.out.println("Result : " + result);
    }
}
