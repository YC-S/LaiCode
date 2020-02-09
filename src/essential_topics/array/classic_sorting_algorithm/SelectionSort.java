package essential_topics.array.classic_sorting_algorithm;

import java.util.Arrays;

// Given an array of integers, sort the elements in the array in ascending order. The selection sort
// algorithm should be used to solve this problem.
//
// Examples
//
// {1} is sorted to {1}
// {1, 2, 3} is sorted to {1, 2, 3}
// {3, 2, 1} is sorted to {1, 2, 3}
// {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
// Corner Cases
//
// What if the given array is null? In this case, we do not need to do anything.
// What if the given array is of length zero? In this case, we do not need to do anything.
//
public class SelectionSort {

  public static int[] solve(int[] array) {
    if (array == null || array.length < 2) {
      return array;
    }
    for (int i = array.length - 1; i >= 0; i--) {
      int maxIndex = i;
      for (int j = i; j >= 0; j--) {
        if (array[j] > array[maxIndex]) {
          maxIndex = j;
        }
      }
      swap(array, i, maxIndex);
    }
    return array;
  }

  private static void swap(int[] array, int a, int b) {
    int tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }

  public static void main(String[] args) {
    int[] array = new int[]{4, 2, -3, 6, 1};
    solve(array);
    System.out.println(Arrays.toString(array));
  }
}
