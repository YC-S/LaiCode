package algorithm_class._05_binary_tree_and_binary_search_tree;

// Find the height of binary tree.
//
// Examples:
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
// The height of above binary tree is 3.
//
// How is the binary tree represented?
//
// We use the level order traversal sequence with a special symbol "#" denoting the null node.

public class HeightOfBinaryTree {

    public static int findHeight(TreeNode root) {
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
        System.out.println(findHeight(t1));
    }
}
