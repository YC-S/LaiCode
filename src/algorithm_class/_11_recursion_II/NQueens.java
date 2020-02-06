package algorithm_class._11_recursion_II;

// Get all valid ways of putting N Queens on an N * N chessboard so that no two Queens threaten each

import java.util.ArrayList;
import java.util.List;

// other.
//
// Assumptions
//
// N > 0
// Return
//
// A list of ways of putting the N Queens
// Each way is represented by a list of the Queen's y index for x indices of 0 to (N - 1)
// Example
//
// N = 4, there are two ways of putting 4 queens:
//
// [1, 3, 0, 2] --> the Queen on the first row is at y index 1, the Queen on the second row is at y
// index 3, the Queen on the third row is at y index 0 and the Queen on the fourth row is at y index
// 2.
//
// [2, 0, 3, 1] --> the Queen on the first row is at y index 2, the Queen on the second row is at y
// index 0, the Queen on the third row is at y index 3 and the Queen on the fourth row is at y index
// 1.
public class NQueens {

  public static List<List<Integer>> nqueens(int n) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    helper(n, cur, res);
    return res;
  }

  private static void helper(int n, List<Integer> cur, List<List<Integer>> res) {
    if (cur.size() == n) {
      res.add(new ArrayList<>(cur));
      return;
    }
    for (int i = 0; i < n; i++) {
      if (valid(cur, i)) {
        cur.add(i);
        helper(n, cur, res);
        cur.remove(cur.size() - 1);
      }
    }
  }

  private static boolean valid(List<Integer> cur, int col) {
    int row = cur.size();
    for (int i = 0; i < row; i++) {
      if (cur.get(i) == col || Math.abs(cur.get(i) - col) == row - i) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(nqueens(1));
  }
}
