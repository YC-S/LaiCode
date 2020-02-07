package algorithm_class._12_dynamic_programming_I;

// Given a rope with positive integer-length n, how to cut the rope into m integer-length parts with
// length p[0], p[1], ...,p[m-1], in order to get the maximal product of p[0]*p[1]* ... *p[m-1]? m
// is determined by you and must be greater than 0 (at least one cut must be made). Return the max
// product you can have.
//
// Assumptions
//
// n >= 2
// Examples
//
// n = 12, the max product is 3 * 3 * 3 * 3 = 81(cut the rope into 4 pieces with length of each is
// 3).
public class MaxProductOfCuttingRope {

  public static int maxProduct(int length) {
    int[] array = new int[length + 1];
    array[0] = 0;
    array[1] = 0;
    for (int i = 2; i < array.length; i++) {
      for (int j = 1; j <= i / 2; j++) {
        array[i] = Math.max(Math.max(j, array[j]) * Math.max(array[i - j], i - j), array[i]);
      }
    }
    return array[length];
  }

  public static void main(String[] args) {
    System.out.println(maxProduct(1));
    System.out.println(maxProduct(2));
    System.out.println(maxProduct(3));
    System.out.println(maxProduct(4));
    System.out.println(maxProduct(5));
  }
}
