package algorithm_class._06_BFS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// Find the K smallest numbers in an unsorted integer array A. The returned numbers should be in
// ascending order.
//
// Assumptions
//
// A is not null
// K is >= 0 and smaller than or equal to size of A
// Return
//
// an array with size K containing the K smallest numbers in ascending order
// Examples
//
// A = {3, 4, 1, 2, 5}, K = 3, the 3 smallest numbers are {1, 2, 3}
public class KSmallestInUnsortedArray {

    // method 1: minheap
    public static int[] kSmallest(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int value : array) {
            minHeap.offer(value);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll();
        }
        return res;
    }

    // method 2: maxHeap
    public static int[] kSmallest1(int[] array, int k) {
        if (array == null || k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        for (int i = 0; i < k; i++) {
            maxHeap.offer(array[i]);
        }
        for (int i = k; i < array.length; i++) {
            if (array[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(array[i]);
            }
        }
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            res[i] = maxHeap.poll();
        }
        return res;
    }


    public static void main(String[] args) {
        int[] A = {3, 4, 1, 2, 5};
        System.out.println(Arrays.toString(kSmallest(A, 3)));
        System.out.println(Arrays.toString(kSmallest1(A, 3)));
    }
}
