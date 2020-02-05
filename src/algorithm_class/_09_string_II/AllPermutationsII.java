package algorithm_class._09_string_II;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Given a string with possible duplicate characters, return a list with all permutations of the
// characters.
//
// Examples
//
// Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]
// Set = "aba", all permutations are ["aab", "aba", "baa"]
// Set = "", all permutations are [""]
// Set = null, all permutations are []
public class AllPermutationsII {

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
    Set<Character> set = new HashSet<>();
    for (int i = index; i < array.length; i++) {
      if (set.add(array[i])) {
        swap(array, i, index);
        helper(array, index + 1, res);
        swap(array, i, index);
      }
    }
  }

  private static void swap(char[] array, int a, int b) {
    char tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }

  public static void main(String[] args) {
    System.out.println(permutations("abbbc"));
    System.out.println(permutations("a"));
  }
}
