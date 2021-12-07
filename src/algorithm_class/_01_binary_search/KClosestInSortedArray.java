package algorithm_class._01_binary_search;

import java.util.Arrays;

// Given a target integer T, a non-negative integer K and an integer array A sorted in ascending
// order, find the K closest numbers to T in A.
//
// Assumptions
//
// A is not null
// K is guaranteed to be >= 0 and K is guaranteed to be <= A.length
//
// Return
//
// A size K integer array containing the K closest numbers(not indices) in A, sorted in ascending
// order by the difference between the number and T.
// Examples
//
// A = {1, 2, 3}, T = 2, K = 3, return {2, 1, 3} or {2, 3, 1}
// A = {1, 4, 6, 8}, T = 3, K = 3, return {4, 1, 6}
public class KClosestInSortedArray {

  public static int[] kClosest(int[] array, int target, int k) {
    // Write your solution here
    if (array == null || array.length == 0 || k == 0) {
      return new int[]{};
    }
    int left = largestSmallerOrEqual(array, target);
    int right = left + 1;
    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      if (right >= array.length || left >= 0 && (target - array[left] <= array[right] - target)) {
        res[i] = array[left--];
      } else {
        res[i] = array[right++];
      }
    }
    return res;
  }

  private static int largestSmallerOrEqual(int[] array, int target) {
    int left = 0, right = array.length - 1;
    while (left < right - 1) {
      int mid = left + (right - left) / 2;
      if (array[mid] <= target) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return array[right] <= target ? right : left;
  }

  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    System.out.println(Arrays.toString(kClosest(array1, 2, 3)));
    int[] array2 = {1, 4, 6, 8};
    System.out.println(Arrays.toString(kClosest(array2, 3, 3)));
  }
}
