package algorithm_class._01_binary_search;

// Given a target integer T and an integer array A sorted in ascending order, find the index of the
// first occurrence of T in A or return -1 if there is no such index.
//
// Assumptions
//
// There can be duplicate elements in the array.
// Examples
//
// A = {1, 2, 3}, T = 2, return 1
// A = {1, 2, 3}, T = 4, return -1
// A = {1, 2, 2, 2, 3}, T = 2, return 1
// Corner Cases
//
// What if A is null or A of zero length? We should return -1 in this case.
public class FirstOccurrence {
  public static int firstOccur(int[] array, int target) {
    if (array == null || array.length == 0) {
      return -1;
    }
    int left = 0, right = array.length - 1;
    while (left < right - 1) {
      int mid = left + (right - left) / 2;
      if (array[mid] >= target) {
        right = mid;
      } else {
        left = mid;
      }
    }
    if (array[left] == target) {
      return left;
    } else if (array[right] == target) {
      return right;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    int[] array1 = {1,2,3};
    System.out.println(firstOccur(array1, 2));
    System.out.println(firstOccur(array1, 4));
    int[] array2 = {};
    System.out.println(firstOccur(array2, 1));
    int[] array3 = {1,2,2,2,3};
    System.out.println(firstOccur(array3, 2));
  }
}
