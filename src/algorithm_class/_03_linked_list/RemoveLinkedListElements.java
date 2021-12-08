package algorithm_class._03_linked_list;

// Remove all elements from a linked list of integers that have value val.
//
// Example
// Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
// Return: 1 --> 2 --> 3 --> 4 --> 5

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = head;
        while (head != null) {
            if (head.value == val) {
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);
        ListNode l7 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        ListNode res = removeElements(l1, 6);
        while (res != null) {
            System.out.println(res.value);
            res = res.next;
        }
    }
}
