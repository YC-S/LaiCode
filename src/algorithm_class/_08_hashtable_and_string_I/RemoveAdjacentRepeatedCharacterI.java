package algorithm_class._08_hashtable_and_string_I;

// Remove adjacent, repeated characters in a given string, leaving only one character for each group
// of such characters.
//
// Assumptions
//
// Try to do it in place.
// Examples
//
// “aaaabbbc” is transferred to “abc”
// Corner Cases
//
// If the given string is null, returning null or an empty string are both valid.
public class RemoveAdjacentRepeatedCharacterI {

  public static String deDup(String input) {
    if (input == null || input.length() == 0) {
      return input;
    }
    char[] array = input.toCharArray();
    int i = 0, j = 0;
    while (j < array.length) {
      if (array[j] == array[i]) {
        j++;
      } else {
        i++;
        array[i] = array[j];
        j++;
      }
    }
    return new String(array, 0, i + 1);
  }

  public static void main(String[] args) {
    System.out.println(deDup("aaaabbbc"));
    System.out.println(deDup(""));
    System.out.println(deDup("abcdefff"));
  }
}
