package algorithm_class._10_bit_representation;

// Determine if the characters of a given string are all unique.
//
// Assumptions
//
// We are using ASCII charset, the value of valid characters are from 0 to 255
// The given string is not null
// Examples
//
// all the characters in "abA+\8" are unique
// "abA+\a88" contains duplicate characters
public class AllUniqueCharactersII {

    public static boolean allUnique(String word) {
        char[] array = new char[256];
        for (int i = 0; i < word.length(); i++) {
            if (array[word.charAt(i)] == 0) {
                array[word.charAt(i)] = 1;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(allUnique("abA+\\8"));
        System.out.println(allUnique("abA+\\88"));
    }
}
