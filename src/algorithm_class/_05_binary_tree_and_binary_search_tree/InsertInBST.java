package algorithm_class._05_binary_tree_and_binary_search_tree;

// Insert a key in a binary search tree if the binary search tree does not already contain the key.
// Return the root of the binary search tree.
//
// Assumptions
//
// There are no duplicate keys in the binary search tree
//
// If the key is already existed in the binary search tree, you do not need to do anything
//
// Examples
//
//        5
//
//      /    \
//
//    3        8
//
//  /   \
//
// 1     4
//
// insert 11, the tree becomes
//
//        5
//
//      /    \
//
//    3        8
//
//  /   \        \
//
// 1     4       11
//
// insert 6, the tree becomes
//
//        5
//
//      /    \
//
//    3        8
//
//  /   \     /  \
//
// 1     4   6    11
public class InsertInBST {

  public static TreeNode insert(TreeNode root, int key) {
    if (root == null) {
      return new TreeNode(key);
    }
    if (root.key < key) {
      root.right = insert(root.right, key);
    }
    if (root.key > key) {
      root.left = insert(root.left, key);
    }
    return root;
  }

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(5);
    TreeNode t2 = new TreeNode(3);
    TreeNode t3 = new TreeNode(8);
    TreeNode t4 = new TreeNode(1);
    TreeNode t5 = new TreeNode(4);
    t1.left = t2;
    t1.right = t3;
    t2.left = t4;
    t2.right = t5;
    insert(t1, 11);
  }
}
