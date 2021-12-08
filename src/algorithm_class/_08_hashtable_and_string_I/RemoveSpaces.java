package algorithm_class._08_hashtable_and_string_I;

// Given a string, remove all leading/trailing/duplicated empty spaces.
//
// Assumptions:
//
// The given string is not null.
// Examples:
//
// “  a” --> “a”
// “   I     love MTV ” --> “I love MTV”
public class RemoveSpaces {

    public static String removeSpaces(String input) {
        char[] array = input.toCharArray();
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ' && (i == 0 || array[i - 1] == ' ')) {
                continue;
            }
            array[end++] = array[i];
        }
        if (end > 0 && array[end - 1] == ' ') {
            end--;
        }
        return new String(array, 0, end);
    }

    public static void main(String[] args) {
        System.out.println(removeSpaces("     a"));
        System.out.println(removeSpaces("     I        love MTV      "));
    }
}
