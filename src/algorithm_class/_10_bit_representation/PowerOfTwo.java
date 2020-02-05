package algorithm_class._10_bit_representation;

// Determine if a given integer is power of 2.
//
// Examples
//
// 16 is power of 2 (2 ^ 4)
// 3 is not
// 0 is not
// -1 is not
public class PowerOfTwo {

  public static boolean isPowerOfTwo(int number) {
    if (number <= 0) {
      return false;
    }
    while ((number & 1) == 0) {
      number >>= 1;
    }
    return number == 1;
  }

  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(16));
    System.out.println(isPowerOfTwo(3));
    System.out.println(isPowerOfTwo(0));
    System.out.println(isPowerOfTwo(-1));
  }
}
