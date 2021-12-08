package algorithm_class._10_bit_representation;

// Determine the number of bits that are different for two given integers.
//
// Examples
//
// 5(“0101”) and 8(“1000”) has 3 different bits
public class DifferentBits {

    public static int diffBits(int a, int b) {
        int res = 0;
        while (a != 0 || b != 0) {
            res += ((a & 1) ^ (b & 1));
            a >>>= 1;
            b >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(diffBits(5, 8));
        System.out.println(diffBits(-1, Integer.MAX_VALUE));
        System.out.println(diffBits(-1, 1));
    }
}
