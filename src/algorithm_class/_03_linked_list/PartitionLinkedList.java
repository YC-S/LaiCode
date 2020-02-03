package algorithm_class._03_linked_list;

// Given a linked list and a target value T, partition it such that all nodes less than T are listed
// before the nodes larger than or equal to target value T. The original relative order of the nodes
// in each of the two partitions should be preserved.
//
// Examples
//
// L = 2 -> 4 -> 3 -> 5 -> 1 -> null, T = 3, is partitioned to 2 -> 1 -> 4 -> 3 -> 5 -> null
public class PartitionLinkedList {

  public static ListNode partition(ListNode head, int target) {
    ListNode dummySmall = new ListNode(0);
    ListNode small = dummySmall;
    ListNode dummyLarge = new ListNode(0);
    ListNode large = dummyLarge;
    while (head != null) {
      if (head.value < target) {
        small.next = head;
        small = small.next;
      } else {
        large.next = head;
        large = large.next;
      }
      head = head.next;
    }
    small.next = dummyLarge.next;
    large.next = null;
    return dummySmall.next;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    ListNode l3 = new ListNode(3);
    ListNode l4 = new ListNode(5);
    ListNode l5 = new ListNode(1);
    ListNode l6 = new ListNode(6);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    l4.next = l5;
    l5.next = l6;
    ListNode res = partition(l1, 3);
    while (res != null) {
      System.out.println(res.value);
      res = res.next;
    }
  }
}
