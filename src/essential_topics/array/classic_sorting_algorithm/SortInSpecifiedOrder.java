package essential_topics.array.classic_sorting_algorithm;

import java.util.Arrays;

// Given two integer arrays A1 and A2, sort A1 in such a way that the relative order among the
// elements will be same as those are in A2.
//
// For the elements that are not in A2, append them in the right end of the A1 in an ascending
// order.
//
// Assumptions:
//
// A1 and A2 are both not null.
// There are no duplicate elements in A2.
// Examples:
//
// A1 = {2, 1, 2, 5, 7, 1, 9, 3}, A2 = {2, 1, 3}, A1 is sorted to {2, 2, 1, 1, 3, 5, 7, 9}
//
public class SortInSpecifiedOrder {

    public static int[] sortSpecial(int[] A1, int[] A2) {
        int[] count = new int[1001];
        for (int n : A1) {
            count[n]++;
        }
        int i = 0;
        int[] res = new int[A1.length];
        for (int n : A2) {
            while (count[n]-- > 0) {
                res[i++] = n;
            }
        }
        for (int n = 0; n < count.length; n++) {
            while (count[n]-- > 0) {
                res[i++] = n;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A1 = {2, 1, 2, 5, 7, 1, 9, 3};
        int[] A2 = {2, 1, 3};
        System.out.println(Arrays.toString(sortSpecial(A1, A2)));
    }
}
