package algorithm_class.binary_search;

public class Classical_Binary_Search {
  public static int binarySearch(int[] array, int target) {
    if (array == null || array.length == 0) {
      return -1;
    }
    int left = 0, right = array.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        return mid;
      } else if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(binarySearch(array, 3));
    System.out.println(binarySearch(array, 0));
    System.out.println(binarySearch(null, 0));
  }
}
