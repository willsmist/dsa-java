package queue;


import com.csygl.dsa.queue.ArrayQueue;

/**
 * 队列很适用于实现循环分配器: 按照环形次序反复循环,为共享某一资源的一群客户做资源分配
 */
public class CirculationDistributor {

    public static void main(String[] args) {
        ArrayQueue<String> q = new ArrayQueue<>();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");

        //noinspection InfiniteLoopStatement
        while (true) {
            String e = q.dequeue();
            serve(e);
            q.enqueue(e);
        }

    }

    public static void serve(Object o) {
        Thread t = Thread.currentThread();
        System.out.println(o);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
