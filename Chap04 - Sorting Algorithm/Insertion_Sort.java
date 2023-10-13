package data_structure_and_algorithm;

public class Insertion_Sort {
    public static void insetion_sort (int [] A , int n ) {
        int item, i, j;

        for (i = 1; i < n; i++) {
            item = A[i] ;
            j = i - 1;

            while (j >= 0 && A[j] > item ) {
                A[j+ 1] = A[j] ;
                j = j - 1 ;
            }
        }
    }

    
    public static void main(String[] args) {
        int [] A = {3,1 ,4, 6, 7,2} ;
        insetion_sort(A, A.length);
    }
}
