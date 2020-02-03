package algorithm_class._03_linked_list;

public class InsertInSortedLinkedList {

  public static ListNode insert(ListNode head, int value) {
    ListNode newNode = new ListNode(value);
    if (head == null || head.value > value) {
      newNode.next = head;
      return newNode;
    }
    ListNode prev = head, cur = head.next;
    while (cur != null) {
      if (cur.value > value) {
        prev.next = newNode;
        newNode.next = cur;
        return head;
      }
      prev = cur;
      cur = cur.next;
    }
    prev.next = newNode;
    return head;
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
    ListNode res = insert(l1, 3);
    while (res != null) {
      System.out.println(res.value);
      res = res.next;
    }
  }
}
