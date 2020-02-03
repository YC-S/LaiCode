package algorithm_class._05_binary_tree_and_binary_search_tree;

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
// In-order traversal is [1, 3, 4, 5, 8, 11]
//
// Corner Cases
//
// What if the given binary tree is null? Return an empty list in this case.
// How is the binary tree represented?
//
// We use the level order traversal sequence with a special symbol "#" denoting the null node.

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversalOfBinaryTree_Recursive {

  public static List<Integer> inOrder(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    helper(root, res);
    return res;
  }

  private static void helper(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    helper(root.left, res);
    res.add(root.key);
    helper(root.right, res);
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
    List<Integer> res = inOrder(t1);
    System.out.println(res);
  }
}
