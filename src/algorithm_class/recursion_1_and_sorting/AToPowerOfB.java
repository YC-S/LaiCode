package algorithm_class.recursion_1_and_sorting;

// Evaluate a to the power of b, assuming both a and b are integers and b is non-negative.
//
// Examples
//
// power(2, 0) = 1
// power(2, 3) = 8
// power(0, 10) = 0
// power(-2, 5) = -32
// Corner Cases
//
// In this question, we assume 0^0 = 1.
// What if the result is overflowed? We can assume the result will not be overflowed when we solve
// this problem on this online judge.
public class AToPowerOfB {

  public static long power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    long half = power(a, b / 2);
    return b % 2 == 1 ? half * half * a : half * half;
  }

  public static void main(String[] args) {
    System.out.println(power(2, 0));
    System.out.println(power(2, 3));
    System.out.println(power(0, 10));
    System.out.println(power(-2, 5));
    System.out.println(power(0, 0));
  }
}
