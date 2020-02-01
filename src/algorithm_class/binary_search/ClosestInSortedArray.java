package algorithm_class.binary_search;

// Given a target integer T and an integer array A sorted in ascending order, find the index i in A
// such that A[i] is closest to T.
//
// Assumptions
//
// There can be duplicate elements in the array, and we can return any of the indices with same
// value.
// Examples
//
// A = {1, 2, 3}, T = 2, return 1
// A = {1, 4, 6}, T = 3, return 1
// A = {1, 4, 6}, T = 5, return 1 or 2
// A = {1, 3, 3, 4}, T = 2, return 0 or 1 or 2
// Corner Cases
//
// What if A is null or A is of zero length? We should return -1 in this case.
public class ClosestInSortedArray {
  public static int closest(int[] array, int target) {
    if (array == null || array.length == 0) {
      return -1;
    }
    int left = 0, right = array.length - 1;
    while (left < right - 1) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] < target) {
        left = mid;
      } else {
        right = mid;
      }
    }
    return Math.abs(array[left] - target) < Math.abs(array[right] - target) ? left : right;
  }

  public static void main(String[] args) {
    int[] array1 = new int[] {1, 2, 3};
    System.out.println(closest(array1, 2));
    int[] array2 = new int[] {1, 4, 6};
    System.out.println(closest(array2, 3));
    System.out.println(closest(array2, 5));
    int[] array3 = new int[] {1, 3, 3, 4};
    System.out.println(closest(array3, 2));
  }
}
