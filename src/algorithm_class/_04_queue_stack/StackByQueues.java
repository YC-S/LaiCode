package algorithm_class._04_queue_stack;

import java.util.ArrayDeque;
import java.util.Queue;

// Implement a stack containing integers using queue(s). The stack should provide push(x), pop(),
// top() and isEmpty() operations.
//
// In java: if the stack is empty, then top() and pop() will return null.
//
// In Python: if the stack is empty, then top() and pop() will return None.
//
// In C++:  if the stack is empty, then top() and pop() will return nullptr.
public class StackByQueues {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackByQueues() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        q1.offer(x);
    }

    public Integer pop() {
        Integer prev = q1.poll();
        Integer cur = q1.poll();
        while (cur != null) {
            q2.offer(prev);
            prev = cur;
            cur = q1.poll();
        }
        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
        return prev;
    }

    public Integer top() {
        Integer res = pop();
        if (res != null) {
            q1.offer(res);
        }
        return res;
    }

    public boolean isEmpty() {
        return top() == null;
    }
}
