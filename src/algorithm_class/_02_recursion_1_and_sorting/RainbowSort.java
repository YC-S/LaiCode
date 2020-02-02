package algorithm_class._02_recursion_1_and_sorting;

import java.util.Arrays;

// Given an array of balls, where the color of the balls can only be Red, Green or Blue, sort the
// balls such that all the Red balls are grouped on the left side, all the Green balls are grouped
// in the middle and all the Blue balls are grouped on the right side. (Red is denoted by -1, Green
// is denoted by 0, and Blue is denoted by 1).
//
// Examples
//
// {0} is sorted to {0}
// {1, 0} is sorted to {0, 1}
// {1, 0, 1, -1, 0} is sorted to {-1, 0, 0, 1, 1}
// Assumptions
//
// The input array is not null.
// Corner Cases
//
// What if the input array is of length zero? In this case, we should not do anything as well.
public class RainbowSort {

  public static int[] rainbowSort(int[] array) {
    if (array == null || array.length < 2) {
      return array;
    }
    int i = 0, j = 0, k = array.length - 1;
    while (j <= k) {
      if (array[j] == -1) {
        swap(array, i++, j++);
      } else if (array[j] == 0) {
        j++;
      } else {
        swap(array, j, k--);
      }
    }
    return array;
  }

  private static void swap(int[] array, int a, int b) {
    int tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }

  public static void main(String[] args) {
    int[] array1 = new int[]{0};
    int[] array2 = new int[]{1, 0};
    int[] array3 = new int[]{1, 0, 1, -1, 0};
    System.out.println(Arrays.toString(rainbowSort(array1)));
    System.out.println(Arrays.toString(rainbowSort(array2)));
    System.out.println(Arrays.toString(rainbowSort(array3)));
  }
}
