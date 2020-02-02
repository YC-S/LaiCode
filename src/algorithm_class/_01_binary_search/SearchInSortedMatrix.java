package algorithm_class._01_binary_search;

import java.util.Arrays;

// matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} }
//
// target = 7, return {1, 2}
//
// target = 6, return {-1, -1} to represent the target number does not exist in the matrix.
public class SearchInSortedMatrix {
  public static int[] search(int[][] matrix, int target) {
    if (matrix == null || matrix[0].length == 0) {
      return new int[] {-1, -1};
    }
    int left = 0, right = matrix.length * matrix[0].length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      int row = mid / matrix[0].length;
      int col = mid % matrix[0].length;
      if (matrix[row][col] == target) {
        return new int[] {row, col};
      } else if (matrix[row][col] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return new int[] {-1, -1};
  }

  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 7}, {8, 9, 10}};
    System.out.println(Arrays.toString(search(matrix, 7)));
    System.out.println(Arrays.toString(search(matrix, 6)));
  }
}
