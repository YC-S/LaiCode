package algorithm_class._11_recursion_II;

import java.util.ArrayList;
import java.util.List;

// Traverse an N * N 2D array in spiral order clock-wise starting from the top left corner. Return
// the list of traversal sequence.
//
// Assumptions
//
// The 2D array is not null and has size of N * N where N >= 0
// Examples
//
// { {1,  2,  3},
//
//  {4,  5,  6},
//
//  {7,  8,  9} }
//
// the traversal sequence is [1, 2, 3, 6, 9, 8, 7, 4, 5]
public class SpiralOrderTraversal {

  public static List<Integer> spiral(int[][] matrix) {
    List<Integer> res = new ArrayList<>();
    helper(matrix, 0, matrix.length, res);
    return res;
  }

  private static void helper(int[][] matrix, int offset, int size, List<Integer> res) {
    if (size == 0) {
      return;
    }
    if (size == 1) {
      res.add(matrix[offset][offset]);
      return;
    }
    for (int i = 0; i < size - 1; i++) {
      res.add(matrix[offset][offset + i]);
    }
    for (int i = 0; i < size - 1; i++) {
      res.add(matrix[offset + i][offset + size - 1]);
    }
    for (int i = size - 1; i >= 1; i--) {
      res.add(matrix[offset + size - 1][offset + i]);
    }
    for (int i = size - 1; i >= 1; i--) {
      res.add(matrix[offset + i][offset]);
    }
    helper(matrix, offset + 1, size - 2, res);
  }

  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(spiral(matrix));
  }
}
