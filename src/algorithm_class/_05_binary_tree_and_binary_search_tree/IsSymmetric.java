package algorithm_class._05_binary_tree_and_binary_search_tree;

// check if a given binary tree is symmetric.
//
// Examples
//
//        5
//
//      /    \
//
//    3        3
//
//  /   \    /   \
//
// 1      4  4      1
//
// is symmetric.
//
//        5
//
//      /    \
//
//    3        3
//
//  /   \    /   \
//
// 1      4  1      4
//
// is not symmetric.
//
// Corner Cases
//
// What if the binary tree is null? Return true in this case.
public class IsSymmetric {

  public static boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return helper(root.left, root.right);
  }

  private static boolean helper(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    return left.key == right.key && helper(left.left, right.right) && helper(left.right,
      right.left);
  }

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(5);
    TreeNode t2 = new TreeNode(3);
    TreeNode t3 = new TreeNode(3);
    TreeNode t4 = new TreeNode(1);
    TreeNode t5 = new TreeNode(4);
    TreeNode t6 = new TreeNode(4);
    TreeNode t7 = new TreeNode(1);
    t1.left = t2;
    t1.right = t3;
    t2.left = t4;
    t2.right = t5;
    t3.left = t6;
    t3.right = t7;
    System.out.println(isSymmetric(t1));
  }
}
