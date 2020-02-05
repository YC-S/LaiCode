package algorithm_class._09_string_II;

// Right shift a given string by n characters.
//
// Assumptions
//
// The given string is not null.
// n >= 0.
// Examples
//
// "abc", 4 -> "cab"
public class RightShiftByNCharacters {

  public static String rightShift(String input, int n) {
    if (input.length() == 0) {
      return input;
    }
    n = n % input.length();
    String pre = input.substring(0, input.length() - n);
    String pos = input.substring(input.length() - n);
    return pos + pre;
  }

  public static void main(String[] args) {
    System.out.println(rightShift("", 10));
    System.out.println(rightShift("abc", 4));
    System.out.println(rightShift("abc", 5));
    System.out.println(rightShift("abc", 6));
  }
}
