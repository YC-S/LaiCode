package algorithm_class._05_binary_tree_and_binary_search_tree;

// Determine if a given binary tree is binary search tree.There should no be duplicate keys in
// binary search tree.
//
// Assumptions
//
// You can assume the keys stored in the binary search tree can not be Integer.MIN_VALUE or
// Integer.MAX_VALUE.
// Corner Cases
//
// What if the binary tree is null? Return true in this case.
public class IsBST {

  public static boolean isBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private static boolean helper(TreeNode root, int min, int max) {
    if (root == null) {
      return true;
    }
    if (root.key >= max || root.key <= min) {
      return false;
    }
    return helper(root.left, min, root.key) && helper(root.right, root.key, max);
  }

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(2);
    TreeNode t3 = new TreeNode(3);
    TreeNode t4 = new TreeNode(4);
    TreeNode t5 = new TreeNode(5);
    t3.left = t2;
    t2.left = t1;
    t3.right = t4;
    t4.right = t5;
    System.out.println(isBST(t3));
  }
}
