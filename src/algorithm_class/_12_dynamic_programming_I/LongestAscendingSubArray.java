package algorithm_class._12_dynamic_programming_I;

// Given an unsorted array, find the length of the longest subarray in which the numbers are in
// ascending order.
//
// Assumptions
//
// The given array is not null
// Examples
//
// {7, 2, 3, 1, 5, 8, 9, 6}, longest ascending subarray is {1, 5, 8, 9}, length is 4.
//
// {1, 2, 3, 3, 4, 4, 5}, longest ascending subarray is {1, 2, 3}, length is 3.
public class LongestAscendingSubArray {

    public static int longest(int[] array) {
        int maxLength = 0;
        int startIndex = 0;
        int endIndex = 0;
        while (endIndex < array.length) {
            if (endIndex == startIndex || array[endIndex] - array[endIndex - 1] > 0) {
                maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                endIndex++;
            } else {
                startIndex = endIndex;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 3, 1, 5, 8, 9, 6};
        int[] array1 = {1, 2, 3, 3, 4, 4, 5};
        System.out.println(longest(array));
        System.out.println(longest(array1));
    }
}
