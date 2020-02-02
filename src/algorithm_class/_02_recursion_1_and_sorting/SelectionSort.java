package algorithm_class._02_recursion_1_and_sorting;

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

import java.util.Arrays;

public class SelectionSort {

  public static int[] sort(int[] array) {
    if (array == null || array.length == 0) {
      return array;
    }
    for (int i = 0; i < array.length; i++) {
      int min = i;
      for (int j = i; j < array.length; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
      }
      int tmp = array[i];
      array[i] = array[min];
      array[min] = tmp;
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {3, 2, 1};
    int[] array3 = {4, 2, -3, 6, 1};
    int[] array4 = {1};
    int[] array5 = {};
    System.out.println(Arrays.toString(sort(array1)));
    System.out.println(Arrays.toString(sort(array2)));
    System.out.println(Arrays.toString(sort(array3)));
    System.out.println(Arrays.toString(sort(array4)));
    System.out.println(Arrays.toString(sort(array5)));
  }
}
