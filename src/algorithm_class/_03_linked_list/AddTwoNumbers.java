package algorithm_class._03_linked_list;

// You are given two linked lists representing two non-negative numbers. The digits are stored in
// reverse order and each of their nodes contain a single digit. Add the two numbers and return it
// as a linked list.
//
// Example
//
// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//
// Output: 7 -> 0 -> 8
//
public class AddTwoNumbers {

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int val = 0;
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    while (l1 != null || l2 != null || val != 0) {
      if (l1 != null) {
        val += l1.value;
        l1 = l1.next;
      }
      if (l2 != null) {
        val += l2.value;
        l2 = l2.next;
      }
      ListNode newNode = new ListNode(val % 10);
      val /= 10;
      cur.next = newNode;
      cur = cur.next;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    ListNode l3 = new ListNode(3);
    ListNode r1 = new ListNode(5);
    ListNode r2 = new ListNode(6);
    ListNode r3 = new ListNode(4);
    l1.next = l2;
    l2.next = l3;
    r1.next = r2;
    r2.next = r3;
    ListNode res = addTwoNumbers(l1, r1);
    while (res != null) {
      System.out.println(res.value);
      res = res.next;
    }
  }
}
