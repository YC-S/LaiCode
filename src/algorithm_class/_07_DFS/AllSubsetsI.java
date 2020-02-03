package algorithm_class._07_DFS;

import java.util.ArrayList;
import java.util.List;

// Given a set of characters represented by a String, return a list containing all subsets of the
// characters.
//
// Assumptions
//
// There are no duplicate characters in the original set.
// ​Examples
//
// Set = "abc", all the subsets are [“”, “a”, “ab”, “abc”, “ac”, “b”, “bc”, “c”]
// Set = "", all the subsets are [""]
// Set = null, all the subsets are []
public class AllSubsetsI {

  public static List<String> subSets(String s) {
    List<String> res = new ArrayList<>();
    if (s == null) {
      return res;
    }
    StringBuilder sb = new StringBuilder();
    char[] arraySet = s.toCharArray();
    helper(arraySet, sb, 0, res);
    return res;
  }

  private static void helper(char[] set, StringBuilder sb, int index, List<String> res) {
    if (index == set.length) {
      res.add(sb.toString());
      return;
    }
    helper(set, sb, index + 1, res);
    helper(set, sb.append(set[index]), index + 1, res);
    sb.deleteCharAt(sb.length() - 1);
  }

  public static void main(String[] args) {
    System.out.println(subSets("abc"));
    System.out.println(subSets(""));
    System.out.println(subSets(null));
    System.out.println(subSets("a"));
    System.out.println(subSets("ab"));
  }
}
