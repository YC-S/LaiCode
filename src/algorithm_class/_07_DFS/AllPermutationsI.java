package algorithm_class._07_DFS;

import java.util.ArrayList;
import java.util.List;

// Given a string with no duplicate characters, return a list with all permutations of the
// characters.
//
// Assume that input string is not null.
//
// Examples
//
// Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]
//
// Set = "", all permutations are [""]
public class AllPermutationsI {

  public static List<String> permutations(String input) {
    List<String> res = new ArrayList<>();
    char[] array = input.toCharArray();
    helper(array, 0, res);
    return res;
  }

  private static void helper(char[] array, int index, List<String> res) {
    if (index == array.length) {
      res.add(new String(array));
      return;
    }
    for (int i = index; i < array.length; i++) {
      swap(array, index, i);
      helper(array, index + 1, res);
      swap(array, index, i);
    }
  }

  private static void swap(char[] array, int a, int b) {
    char tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }

  public static void main(String[] args) {
    System.out.println(permutations("abc"));
    System.out.println(permutations(""));
  }
}
