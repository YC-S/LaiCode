package algorithm_class._04_queue_stack;

import java.util.Deque;
import java.util.LinkedList;

// Given an array that is initially stored in one stack, sort it with one additional stacks (total 2
// stacks).
//
// After sorting the original stack should contain the sorted integers and from top to bottom the
// integers are sorted in ascending order.
//
// Assumptions:
//
// The given stack is not null.
// There can be duplicated numbers in the give stack.
// Requirements:
//
// No additional memory, time complexity = O(n ^ 2).
public class SortWith2Stacks {

  public static void sort(LinkedList<Integer> s1) {
    LinkedList<Integer> s2 = new LinkedList<>();
    if (s1 == null || s1.size() <= 1) {
      return;
    }
    sort(s1, s2);
  }

  private static void sort(Deque<Integer> input, Deque<Integer> buffer) {
    while (!input.isEmpty()) {
      int curMin = Integer.MAX_VALUE;
      int count = 0;
      while (!input.isEmpty()) {
        int cur = input.pollFirst();
        if (cur < curMin) {
          curMin = cur;
          count = 1;
        } else if (cur == curMin) {
          count++;
        }
        buffer.offerFirst(cur);
      }
      while (!buffer.isEmpty() && buffer.peekFirst() >= curMin) {
        int tmp = buffer.pollFirst();
        if (tmp != curMin) {
          input.offerFirst(tmp);
        }
      }
      while (count-- > 0) {
        buffer.offerFirst(curMin);
      }
    }
    while (!buffer.isEmpty()) {
      input.offerFirst(buffer.pollFirst());
    }
  }

  public static void main(String[] args) {
    LinkedList<Integer> s1 = new LinkedList<>();
    s1.add(2);
    s1.add(3);
    s1.add(1);
    s1.add(6);
    s1.add(4);
    s1.add(5);
    sort(s1);
    while (!s1.isEmpty()) {
      System.out.println(s1.poll());
    }
  }
}
