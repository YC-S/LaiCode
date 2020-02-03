package algorithm_class._03_linked_list;

public class ReOrderLinkedList {

  public static ListNode reorder(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode mid = middleNode(head);
    ListNode midNext = mid.next;
    mid.next = null;
    ListNode right = reverse(midNext);
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    while (head != null && right != null) {
      cur.next = head;
      head = head.next;
      cur.next.next = right;
      right = right.next;
      cur = cur.next.next;
    }
    if (head == null) {
      cur.next = right;
    }
    if (right == null) {
      cur.next = head;
    }
    return dummy.next;
  }

  private static ListNode middleNode(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private static ListNode reverse(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode newHead = reverse(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode l2 = new ListNode(2);
    ListNode l3 = new ListNode(3);
    ListNode l4 = new ListNode(4);
    ListNode l5 = new ListNode(5);
    ListNode l6 = new ListNode(6);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
//    l4.next = l5;
//    l5.next = l6;

    ListNode res = reorder(l1);
    while (res != null) {
      System.out.println(res.value);
      res = res.next;
    }
  }
}
