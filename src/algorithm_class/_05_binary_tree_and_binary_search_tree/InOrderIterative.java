package algorithm_class._05_binary_tree_and_binary_search_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class InOrderIterative {

    public static List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.offerFirst(cur);
                cur = cur.left;
            } else {
                cur = stack.pollFirst();
                res.add(cur.key);
                cur = cur.right;
            }
        }
        return res;
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
