package algorithm_class._02_recursion_I_and_sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * @author shiyuanchen
 * <p>
 * Given an array of integers, sort the elements in the array in ascending order. The quick sort
 * algorithm should be used to solve this problem.
 * <p>
 * Examples
 * <p>
 * {1} is sorted to {1} {1, 2, 3} is sorted to {1, 2, 3} {3, 2, 1} is sorted to {1, 2, 3} {4, 2, -3,
 * 6, 1} is sorted to {-3, 1, 2, 4, 6} Corner Cases
 * <p>
 * What if the given array is null? In this case, we do not need to do anything. What if the given
 * array is of length zero? In this case, we do not need to do anything.
 */
public class QuickSort {

    static Random random = new Random();

    private static int[] quickSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = random.nextInt(right - left + 1) + left;
        swap(array, pivotIndex, right);
        int i = left, j = right - 1;
        while (i <= j) {
            if (array[i] <= array[right]) {
                i++;
            } else {
                swap(array, i, j--);
            }
        }
        swap(array, i, right);
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    private static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {3, 2, 1};
        int[] array3 = {4, 2, -3, 6, 1};
        int[] array4 = {1};
        int[] array5 = {};
        System.out.println(Arrays.toString(quickSort(array1)));
        System.out.println(Arrays.toString(quickSort(array2)));
        System.out.println(Arrays.toString(quickSort(array3)));
        System.out.println(Arrays.toString(quickSort(array4)));
        System.out.println(Arrays.toString(quickSort(array5)));
    }
}
