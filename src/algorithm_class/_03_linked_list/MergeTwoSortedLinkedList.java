package algorithm_class._03_linked_list;

public class MergeTwoSortedLinkedList {

  public static ListNode merge(ListNode one, ListNode two) {
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    while (one != null && two != null) {
      if (one.value < two.value) {
        cur.next = one;
        one = one.next;
      } else {
        cur.next = two;
        two = two.next;
      }
      cur = cur.next;
    }
    if (one == null) {
      cur.next = two;
    }
    if (two == null) {
      cur.next = one;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(3);
    ListNode l3 = new ListNode(5);
    ListNode l4 = new ListNode(7);
    ListNode l5 = new ListNode(9);
    ListNode l6 = new ListNode(11);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    l4.next = l5;
    l5.next = l6;

    ListNode r1 = new ListNode(0);
    ListNode r2 = new ListNode(2);
    ListNode r3 = new ListNode(4);
    ListNode r4 = new ListNode(6);
    ListNode r5 = new ListNode(8);
    ListNode r6 = new ListNode(10);
    r1.next = r2;
    r2.next = r3;
    r3.next = r4;
    r4.next = r5;
    r5.next = r6;

    ListNode res = merge(l1, r1);
    while (res != null) {
      System.out.println(res.value);
      res = res.next;
    }
  }
}
