package algorithm_class._09_string_II;

// Reverse a given string.
//
// Assumptions
//
// The given string is not null.
public class ReverseString {

    public static String reverse(String input) {
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, input.length() - 1 - i);
        }
        return new String(array);
    }

    private static void swap(char[] array, int a, int b) {
        char tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(reverse("abc"));
    }
}
