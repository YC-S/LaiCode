package algorithm_class._10_bit_representation;

// Generate the hexadecimal representation for a given non-negative integer number as a string. The
// hex representation should start with "0x".
//
// There should not be extra zeros on the left side.
//
// Examples
//
// 0's hex representation is "0x0"
// 255's hex representation is "0xFF"
public class Hex {

  public static String hex(int number) {
    String prefix = "0x";
    if (number == 0) {
      return prefix + "0";
    }
    StringBuilder sb = new StringBuilder();
    while (number > 0) {
      int tmp = number % 16;
      if (tmp < 10) {
        sb.append((char) (tmp + '0'));
      } else {
        sb.append((char) (tmp - 10 + 'A'));
      }
      number >>>= 4;
    }
    return prefix + sb.reverse().toString();
  }

  public static void main(String[] args) {
    System.out.println(hex(255));
    System.out.println(hex(1));
    System.out.println(hex(2));
    System.out.println(hex(3));
    System.out.println(hex(Integer.MAX_VALUE));
  }
}
