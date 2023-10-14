package data_structure_and_algorithm;

public class Bubble_Sort {

    public static void bubble_sort(int [] A, int n) {
        int i, j, temp;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (A [j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }

//            for (int x : A) System.out.print (x + " ");
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] A = {3,1 ,4, 6, 7,2} ;
        bubble_sort(A, A.length);
    }
}

//output:
//        1 3 4 2 6 7
//        1 3 2 4 6 7
//        1 2 3 4 6 7
//        1 2 3 4 6 7
//        1 2 3 4 6 7