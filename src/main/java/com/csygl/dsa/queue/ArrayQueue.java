package com.csygl.dsa.queue;

/**
 * 基于循环数组实现的队列
 *
 * @param <E> 类型参数
 */
public class ArrayQueue<E> implements Queue<E> {

    public static final int CAPACITY = 1024;

    protected final int capacity;

    protected final Object[] q;

    //指向队列首元素
    protected int f;

    //指向队列末元素
    protected int r;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int cap) {
        capacity = cap;
        q = new Object[capacity];
        f = 0;
        r = 0;
    }


    /**
     * 获取队列中元素的个数
     *
     * @return 队列中元素的个数
     */
    @Override
    public int getSize() {
//        if(r - f =< 0){
//            return (r - f + capacity);
//        }
//        return (r - f);
        //以上语句等同于下面的语句
        return (r - f + capacity) % capacity;
    }

    /**
     * 判断队列是否为空
     *
     * @return true 表示队列非空, false 表示队列空
     */
    @Override
    public boolean isEmpty() {
        /*
        显然，f == r 还可能表示队列已满，
        下面的入队方法实现可保证 f== r 时表示队列空
         */
        return f == r;
    }

    /**
     * 入队
     * <p>
     * 将指定对象加入队列末端
     *
     * @param e 入队对象
     */
    @Override
    public void enqueue(E e) {
        //这样检查才会使得 f== r 能判断队列为空
        //即 r 始终指向一个空的节点,入队操作不能使得 r 移动到 f
        //如此，队列最大规模为 capacity - 1
        if (/*getSize() == capacity - 1*/ (r + 1) % capacity == f) {
            throw new ArrayQueueFullException();
        }
        q[r] = e;
        r = (r + 1) % capacity;
    }

    //类型转换，凡是通过下标访问元素需要类型转换的都用此方法访问
    //这样可以避免在其他方法声明上都要加 @SuppressWarnings("unchecked")
    @SuppressWarnings("unchecked")
    E elementData(int index) {
        return (E) q[index];
    }

    /**
     * 出队
     * <p>
     * 若队列非空，则将队首元素移除,并将其返回
     * 否则，抛出异常
     *
     * @return 队首元素
     * @throws QueueEmptyException 队列空异常
     */
    @Override
    public E dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        E ele = elementData(f);
        q[f] = null;
        f = (f + 1) % capacity;
        return ele;
    }

    /**
     * 出队
     * <p>
     * 若队列非空，则将队首元素返回
     * 否则，抛出异常
     *
     * @return 队首元素
     * @throws QueueEmptyException 队列空异常
     */
    @Override
    public E front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        return elementData(f);
    }

    /**
     * 遍历队列
     */
    @Override
    public void traversal() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        for (int i = f; i < f + getSize() - 1; i++) {
            System.out.print(elementData(i % capacity) + ", ");
        }
        System.out.println(elementData((f + getSize() - 1) % capacity));
    }
}
