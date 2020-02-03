package algorithm_class._03_linked_list;

public class MiddleNode {

  public static ListNode middleNode(ListNode head) {
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

  public static void main(String[] args) {
    ListNode l1 = new ListNode(0);
    ListNode l2 = new ListNode(1);
    ListNode l3 = new ListNode(2);
    ListNode l4 = new ListNode(3);
    ListNode l5 = new ListNode(4);
    ListNode l6 = new ListNode(5);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    l4.next = l5;
    l5.next = l6;
    ListNode middle = middleNode(l1);
    System.out.println(middle.value);
  }
}
