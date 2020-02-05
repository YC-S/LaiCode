package algorithm_class._09_string_II;

// Reverse the words in a sentence.
//
// Assumptions
//
// Words are separated by single space
//
// There are no heading or tailing white spaces
//
// Examples
//
// “I love Google” → “Google love I”
//
// Corner Cases
//
// If the given string is null, we do not need to do anything.
public class ReverseWords {

  public static String reverseWords(String input) {
    String[] res = input.split(" ");
    for (int i = 0; i < res.length / 2; i++) {
      swap(res, i, res.length - 1 - i);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < res.length; i++) {
      sb.append(res[i]);
      sb.append(" ");
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }

  private static void swap(String[] array, int a, int b) {
    String tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }

  public static void main(String[] args) {
    System.out.println(reverseWords("I Love Google"));
  }
}
