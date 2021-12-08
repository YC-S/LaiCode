package algorithm_class._04_queue_stack;

import java.util.LinkedList;

// Implement a queue by using two stacks. The queue should provide size(), isEmpty(), offer(),
// poll() and peek() operations. When the queue is empty, poll() and peek() should return null;
public class QueueByTwoStacks {

    // always insert into the in stack
    // always remove from the out stack
    private LinkedList<Integer> in;
    private LinkedList<Integer> out;

    public QueueByTwoStacks() {
        in = new LinkedList<>();
        out = new LinkedList<>();
    }

    public Integer poll() {
        move();
        return out.isEmpty() ? null : out.pollFirst();
    }

    public void move() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.offerFirst(in.pollFirst());
            }
        }
    }

    public void offer(int element) {
        in.offerFirst(element);
    }

    public Integer peek() {
        move();
        return out.isEmpty() ? null : out.peekFirst();
    }

    public int size() {
        return in.size() + out.size();
    }

    public boolean isEmpty() {
        return in.size() + out.size() == 0;
    }
}
