package essential_topics.array._2d_array;

import java.util.ArrayList;
import java.util.List;

// Traverse an M * N 2D array in spiral order clock-wise starting from the top left corner. Return
// the list of traversal sequence.
//
// Assumptions
//
// The 2D array is not null and has size of M * N where M, N >= 0
// Examples
//
// { {1,  2,  3,  4},
//
//  {5,  6,  7,  8},
//
//  {9, 10, 11, 12} }
//
// the traversal sequence is [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
public class SpiralOrderTraversal_II {

    public static List<Integer> spiral(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) {
            return res;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return res;
        }
        int left = 0, right = n - 1, up = 0, down = m - 1;
        while (left < right && up < down) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            for (int i = up + 1; i < down - 1; i++) {
                res.add(matrix[i][right]);
            }
            for (int i = right; i >= left; i--) {
                res.add(matrix[down][i]);
            }
            for (int i = down - 1; i >= up + 1; i--) {
                res.add(matrix[i][left]);
            }
            left++;
            right--;
            up++;
            down--;
        }
        if (left > right || up > down) {
            return res;
        }
        if (left == right) {
            for (int i = up; i <= down; i++) {
                res.add(matrix[i][left]);
            }
        } else {
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiral(matrix));
    }
}
