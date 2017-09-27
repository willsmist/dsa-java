package queue;

import com.csygl.dsa.queue.ArrayQueue;
import com.csygl.dsa.queue.Queue;

public class Josephus {

    public static void main(String[] args) {
        Queue<String> q = new ArrayQueue<>();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        q.traversal();
        System.out.println(lucky(q, 2));
    }

    public static <E> E lucky(Queue<E> q, int k) {
        while (q.getSize() > 1) {
            for (int i = 1; i <= k; i++) {
                if (i == k) {
                    q.dequeue();
                } else {
                    E e = q.dequeue();
                    q.enqueue(e);
                }
            }
        }
        return q.dequeue();
    }
}
