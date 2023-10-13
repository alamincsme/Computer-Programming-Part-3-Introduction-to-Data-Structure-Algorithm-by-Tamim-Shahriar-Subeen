package data_structure_and_algorithm;

public class Selection_Sort {

    public static void selection_sort (int [] A  , int n) {
        int i, j, index_min, temp;

        for (i = 0; i < n ; i++) {
            index_min = i ;

            for (j = i + 1 ; j < n; j++ ) {
                if (A[j] < A [index_min]) {
                    index_min = j ;
                }
            }

            if (index_min != i) {
                temp = A[i] ;
                A[i] = A[index_min];
                A[index_min] = temp;
            }

//            for (int x : A) System.out.print(x + " ");
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] A = {3,1 ,4, 6, 7,2} ;
        selection_sort(A, A.length);

    }
}
//        output :
//        1 3 4 6 7 2
//        1 2 4 6 7 3
//        1 2 3 6 7 4
//        1 2 3 4 7 6
//        1 2 3 4 6 7
//        1 2 3 4 6 7