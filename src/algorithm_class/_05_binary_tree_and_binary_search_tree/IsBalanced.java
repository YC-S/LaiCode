package algorithm_class._05_binary_tree_and_binary_search_tree;

// Check if a given binary tree is balanced. A balanced binary tree is one in which the depths of
// every node’s left and right subtree differ by at most 1.
//
// Examples
//
//        5
//
//      /    \
//
//    3        8
//
//  /   \        \
//
// 1      4        11
//
// is balanced binary tree,
//
//        5
//
//      /
//
//    3
//
//  /   \
//
// 1      4
//
// is not balanced binary tree.
//
// Corner Cases
//
// What if the binary tree is null? Return true in this case.

public class IsBalanced {

  public static boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    boolean leftB = isBalanced(root.left);
    boolean rightB = isBalanced(root.right);
    if (!leftB || !rightB) {
      return false;
    }
    int left = findHeight(root.left);
    int right = findHeight(root.right);
    return Math.abs(left - right) <= 1;
  }

  private static int findHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = findHeight(root.left);
    int right = findHeight(root.right);
    return Math.max(left, right) + 1;
  }

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(5);
    TreeNode t2 = new TreeNode(3);
    TreeNode t3 = new TreeNode(8);
    TreeNode t4 = new TreeNode(1);
    TreeNode t5 = new TreeNode(4);
    TreeNode t6 = new TreeNode(11);
    t1.left = t2;
    t1.right = t3;
    t2.left = t4;
    t2.right = t5;
    t3.right = t6;
    System.out.println(isBalanced(t1));
  }
}
