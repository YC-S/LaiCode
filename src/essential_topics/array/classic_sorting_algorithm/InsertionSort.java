package essential_topics.array.classic_sorting_algorithm;

import java.util.Arrays;

// Given an array of integers, sort the elements in the array in ascending order. The insertion sort
// algorithm should be used to solve this problem.
//
// Examples
//
// {1, 2, 3} is sorted to {1, 2, 3}
// {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
// Corner Cases
//
// What if the given array is null? In this case, we do not need to do anything.
// What if the given array is of length zero? In this case, we do not need to do anything.
public class InsertionSort {

    public static int[] sort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] <= array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
        return array;
    }

    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, -3, 6, 1};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
