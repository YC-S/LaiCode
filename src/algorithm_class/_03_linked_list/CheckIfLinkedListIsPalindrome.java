package algorithm_class._03_linked_list;

// Given a linked list, check whether it is a palindrome.
//
// Examples:
//
// Input:   1 -> 2 -> 3 -> 2 -> 1 -> null
//
// output: true.
//
// Input:   1 -> 2 -> 3 -> null
//
// output: false.
//
// Requirements:
//
// Space complexity must be O(1)
public class CheckIfLinkedListIsPalindrome {

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode mid = middleNode(head);
        ListNode right = reverse(mid);
        while (head != null && right != null) {
            if (head.value != right.value) {
                return false;
            }
            head = head.next;
            right = right.next;
        }
        return true;
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
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(isPalindrome(l1));
    }
}
