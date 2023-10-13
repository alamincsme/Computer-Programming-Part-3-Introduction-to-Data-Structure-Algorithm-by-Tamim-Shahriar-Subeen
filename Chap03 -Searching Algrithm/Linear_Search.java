package data_structure_and_algorithm;

public class Linear_Search {

    public static int linear_search (int [] A , int n , int item) {
        int i ;
        for (i = 0 ; i < n; i++) {
             if (A[i] == item) {
                 return i ;
             }
        }
        return -1;
    }
}
