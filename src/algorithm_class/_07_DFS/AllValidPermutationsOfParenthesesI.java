package algorithm_class._07_DFS;

import java.util.ArrayList;
import java.util.List;

public class AllValidPermutationsOfParenthesesI {

    public static List<String> validParentheses(int n) {
        List<String> res = new ArrayList<>();
        int l = 0;
        int r = 0;
        StringBuilder sb = new StringBuilder();
        helper(l, r, n, sb, res);
        return res;
    }

    private static void helper(int l, int r, int n, StringBuilder sb, List<String> res) {
        if (l == n && r == n) {
            res.add(sb.toString());
            return;
        }
        // Case 1: add ( to current level
        if (l < n) {
            helper(l + 1, r, n, sb.append("("), res);
            sb.deleteCharAt(sb.length() - 1);
        }

        // Case 2: add ) to current level
        if (l > r) {
            helper(l, r + 1, n, sb.append(")"), res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(validParentheses(1));
        System.out.println(validParentheses(2));
        System.out.println(validParentheses(3));
    }
}
