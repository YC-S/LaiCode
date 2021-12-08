package algorithm_class._04_queue_stack;

import java.util.ArrayDeque;
import java.util.Deque;

// Enhance the stack implementation to support min() operation. min() should return the current
// minimum value in the stack. If the stack is empty, min() should return -1.
//
// push(int element) - push the element to top
// pop() - return the top element and remove it, if the stack is empty, return -1
// top() - return the top element without remove it, if the stack is empty, return -1
// min() - return the current min value in the stack.
public class StackWithMin {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public StackWithMin() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        Integer res = stack.pollFirst();
        if (!minStack.isEmpty() && minStack.peekFirst().equals(res)) {
            minStack.pollFirst();
        }
        return res;
    }

    public void push(int element) {
        stack.offerFirst(element);
        if (minStack.isEmpty() || element <= minStack.peekFirst()) {
            minStack.offerFirst(element);
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peekFirst();
    }

    public int min() {
        return minStack.isEmpty() ? -1 : minStack.peekFirst();
    }
}
