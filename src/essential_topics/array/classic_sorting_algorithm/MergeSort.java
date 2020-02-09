package essential_topics.array.classic_sorting_algorithm;

import java.util.Arrays;

// Given an array of integers, sort the elements in the array in ascending order. The merge sort
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
public class MergeSort {

  public static int[] mergeSort(int[] array) {
    if (array == null || array.length < 2) {
      return array;
    }
    int[] helper = new int[array.length];
    mergeSort(array, 0, array.length - 1, helper);
    return array;
  }

  private static void mergeSort(int[] array, int left, int right, int[] helper) {
    if (left >= right) {
      return;
    }
    int mid = left + (right - left) / 2;
    mergeSort(array, left, mid, helper);
    mergeSort(array, mid + 1, right, helper);
    merge(array, left, mid, right, helper);
  }

  private static void merge(int[] array, int left, int mid, int right, int[] helper) {
    for (int i = left; i <= right; i++) {
      helper[i] = array[i];
    }
    int i = left, j = mid + 1, k = left;
    while (i <= mid && j <= right) {
      if (helper[i] <= helper[j]) {
        array[k++] = helper[i++];
      } else {
        array[k++] = helper[j++];
      }
    }
    while (i <= mid) {
      array[k++] = helper[i++];
    }
  }

  public static void main(String[] args) {
    int[] array = {4, 2, -3, 6, 1};
    mergeSort(array);
    System.out.println(Arrays.toString(array));
  }
}
