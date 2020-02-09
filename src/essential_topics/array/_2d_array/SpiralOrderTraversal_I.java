package essential_topics.array._2d_array;

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
public class SpiralOrderTraversal_I {

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
    int[][] matrix2 = {
      {21, -31, -35, 23, 96, 25, 59, -96, -59, 44},
      {58, 20, -42, 10, 46, 16, 60, -35, -69, -26},
      {62, -7, 28, 1, -72, -72, 14, 87, 15, -92},
      {65, 45, -60, 80, 27, 8, -86, -63, 82, 87},
      {-15, -85, 10, -60, 72, -84, 82, 100, -79, -82},
      {48, 85, -56, 46, 93, -12, 7, 19, -59, 93},
      {-54, 71, -94, 45, -88, 29, 95, -76, -38, -8},
      {-77, 98, 93, 85, 16, -78, -38, -73, -20, -64},
      {-96, 30, 20, -59, -9, 47, 6, 7, 50, 92},
      {-73, -3, -62, 61, 24, -43, -14, 43, 9, 96}
    };
    System.out.println(spiral(matrix));
    System.out.println(spiral(matrix2));
  }
}
