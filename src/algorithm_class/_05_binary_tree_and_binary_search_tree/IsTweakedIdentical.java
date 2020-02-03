package algorithm_class._05_binary_tree_and_binary_search_tree;

public class IsTweakedIdentical {

  public static boolean isTweakedIdentical(TreeNode one, TreeNode two) {
    if (one == null && two == null) {
      return true;
    }
    if (one == null || two == null) {
      return false;
    }
    return one.key == two.key
      && (isTweakedIdentical(one.left, two.left) && isTweakedIdentical(one.right, two.right)
      || (isTweakedIdentical(one.left, two.right)
      && isTweakedIdentical(one.right, two.left)));
  }

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode(5);
    TreeNode t2 = new TreeNode(3);
    TreeNode t3 = new TreeNode(8);
    TreeNode t4 = new TreeNode(1);
    TreeNode t5 = new TreeNode(4);
    t1.left = t2;
    t1.right = t3;
    t2.left = t4;
    t2.right = t5;

    TreeNode r1 = new TreeNode(5);
    TreeNode r2 = new TreeNode(8);
    TreeNode r3 = new TreeNode(3);
    TreeNode r4 = new TreeNode(1);
    TreeNode r5 = new TreeNode(4);
    r1.left = r2;
    r1.right = r3;
    r3.left = r4;
    r3.right = r5;

    System.out.println(isTweakedIdentical(t1, r1));
  }
}
