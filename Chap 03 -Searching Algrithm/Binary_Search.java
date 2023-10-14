package data_structure_and_algorithm;

public class Binary_Search {

    public static int binary_search (int A[] , int n, int item) {
        int left , right, mid;
        left = 0 ;
        right = n - 1;

        while (left <= right) {
            mid = (left + (right - left ) / 2 ) ;

            if (A[mid] == item) {
                return mid;
            }

            if (A[mid] < item) {
                left = mid + 1 ;
            } else {
                right  = mid - 1 ;
            }
        }

        return  - 1 ;
    }
}
