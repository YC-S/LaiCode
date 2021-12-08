package algorithm_class._05_binary_tree_and_binary_search_tree;

import java.util.ArrayList;
import java.util.List;

public class GetKeysInBSTInGivenRange {

    public static List<Integer> getRange(TreeNode root, int min, int max) {
        List<Integer> res = new ArrayList<>();
        helper(root, min, max, res);
        return res;
    }

    private static void helper(TreeNode root, int min, int max, List<Integer> res) {
        if (root == null) {
            return;
        }
        if (root.key > min) {
            helper(root.left, min, max, res);
        }
        if (root.key >= min && root.key <= max) {
            res.add(root.key);
        }
        if (root.key < max) {
            helper(root.right, min, max, res);
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        t4.left = t2;
        t4.right = t6;
        t2.left = t1;
        t2.right = t3;
        t6.left = t5;
        t6.right = t7;
        System.out.println(getRange(t4, 2, 5));
    }
}
