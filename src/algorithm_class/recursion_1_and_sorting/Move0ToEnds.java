package algorithm_class.recursion_1_and_sorting;

// Given an array of integers, move all the 0s to the right end of the array.
//
// The relative order of the elements in the original array does not need to be maintained.
//
// Assumptions:
//
// The given array is not null.
// Examples:
//
// {1} --> {1}
// {1, 0, 3, 0, 1} --> {1, 3, 1, 0, 0} or {1, 1, 3, 0, 0} or {3, 1, 1, 0, 0}

import java.util.Arrays;

public class Move0ToEnds {

  public static int[] moveZero(int[] array) {
    if (array == null || array.length < 2) {
      return array;
    }
    int i = 0, j = array.length - 1;
    while (i <= j) {
      if (array[i] == 0) {
        swap(array, i, j--);
      } else {
        i++;
      }
    }
    return array;
  }

  public static int[] moveZero1(int[] array) {
    if (array == null || array.length < 2) {
      return array;
    }
    int i = 0, j = 0;
    while (j < array.length) {
      if (array[j] != 0) {
        swap(array, i++, j);
      }
      j++;
    }
    return array;
  }

  private static void swap(int[] array, int a, int b) {
    int tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }

  public static void main(String[] args) {
    int[] array1 = {1};
    int[] array2 = {1, 0, 3, 0, 1};
    int[] array3 = {0, 0, 0, 1, 0, 3, 0, 1};
    System.out.println(Arrays.toString(moveZero(array1)));
    System.out.println(Arrays.toString(moveZero(array2)));
    System.out.println(Arrays.toString(moveZero1(array1)));
    System.out.println(Arrays.toString(moveZero1(array2)));
    System.out.println(Arrays.toString(moveZero1(array3)));
  }
}
