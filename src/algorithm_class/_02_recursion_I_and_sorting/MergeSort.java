package algorithm_class._02_recursion_I_and_sorting;

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

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
        return array;
    }

    private static void mergeSort(int[] array, int[] helper, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid + 1, right);
        merge(array, helper, left, mid, right);
    }

    private static void merge(int[] array, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (helper[i] < helper[j]) {
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
        int[] array1 = {1, 2, 3};
        int[] array2 = {3, 2, 1};
        int[] array3 = {4, 2, -3, 6, 1};
        int[] array4 = {1};
        int[] array5 = {};
        System.out.println(Arrays.toString(mergeSort(array1)));
        System.out.println(Arrays.toString(mergeSort(array2)));
        System.out.println(Arrays.toString(mergeSort(array3)));
        System.out.println(Arrays.toString(mergeSort(array4)));
        System.out.println(Arrays.toString(mergeSort(array5)));
    }
}
