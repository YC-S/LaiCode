package algorithm_class._08_hashtable_and_string_I;

import java.util.ArrayList;
import java.util.List;

// Find all numbers that appear in both of two sorted arrays (the two arrays are all sorted in
// ascending order).
//
// Assumptions
//
// In each of the two sorted arrays, there could be duplicate numbers.
// Both two arrays are not null.
// Examples
//
// A = {1, 1, 2, 2, 3}, B = {1, 1, 2, 5, 6}, common numbers are [1, 1, 2]
public class CommonNumbersOfTwoSortedArrays {

    public static List<Integer> common(int[] A, int[] B) {
        List<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        if (A == null || B == null) {
            return res;
        }
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                res.add(A[i]);
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 2, 2, 3};
        int[] B = {1, 1, 2, 5, 6};
        System.out.println(common(A, B));
    }
}
