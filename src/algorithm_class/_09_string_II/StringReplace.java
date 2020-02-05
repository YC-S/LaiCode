package algorithm_class._09_string_II;

// Given an original string input, and two strings S and T, replace all occurrences of S in input
// with T.
//
// Assumptions
//
// input, S and T are not null, S is not empty string
// Examples
//
// input = "appledogapple", S = "apple", T = "cat", input becomes "catdogcat"
// input = "laicode", S = "code", T = "offer", input becomes "laioffer"
public class StringReplace {

  public static String replace(String input, String source, String target) {
    StringBuilder sb = new StringBuilder();
    int startIndex = 0;
    int matchIndex = input.indexOf(source, startIndex);
    while (matchIndex != -1) {
      sb.append(input, startIndex, matchIndex).append(target);
      startIndex = matchIndex + source.length();
      matchIndex = input.indexOf(source, startIndex);
    }
    sb.append(input, startIndex, input.length());
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(replace("appledogapple", "apple", "cat"));
    System.out.println(replace("iraqlithuaniaandorraaustriapalauslovenia", "palau", "peru"));
  }
}
