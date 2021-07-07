package small_class.class1;

public class PackingUpSwags {
  public static int packingUpSwags(int num) {
    int[] array = new int[num + 1];
    array[0] = 0;
    array[1] = 1;
    for (int i = 2; i <= num; i++) {
      if (Math.sqrt(i) % 1 == 0) {
        return 1;
      }
      int min = i;
      for (int j = 1; j < i; j++) {
        min = Math.min(min, array[j] + array[i - j]);
      }
    }
    return array[num];
  }

  public static void main(String[] args) {
    System.out.println(Math.sqrt(5));
    System.out.println(packingUpSwags(1));
    System.out.println(packingUpSwags(5));
    System.out.println(packingUpSwags(4));
  }
}
