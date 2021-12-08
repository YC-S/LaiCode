package algorithm_class._08_hashtable_and_string_I;

// Given an integer array of size N - 1, containing all the numbers from 1 to N except one, find the
// missing number.
//
// Assumptions
//
// The given array is not null, and N >= 1
// Examples
//
// A = {2, 1, 4}, the missing number is 3
// A = {1, 2, 3}, the missing number is 4
// A = {}, the missing number is 1
public class MissingNumberI {

    public static int missing(int[] array) {
        int res = 0;
        int n = array.length;
        for (int i = 1; i <= n + 1; i++) {
            res += i;
        }
        for (int i : array) {
            res -= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 4};
        int[] B = new int[]{1, 2, 3};
        int[] C = new int[]{};
        System.out.println(missing(A));
        System.out.println(missing(B));
        System.out.println(missing(C));
    }
}
