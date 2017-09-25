package com.csygl.dsa.stack;

/**
 * 定长数组实现 Stack 接口
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {

    //数组默认容量
    public static final int CAPACITY = 1024;
    //对象数组
    protected final Object[] s;
    //数组实际容量
    protected int capacity;
    //栈顶元素的位置
    protected int top = -1;

    /**
     * 按默认容量创建栈
     */
    public ArrayStack() {
        this(CAPACITY);
        capacity = CAPACITY;
    }

    /**
     * 按指定容量创建栈
     *
     * @param cap 栈容量
     */
    public ArrayStack(int cap) {
        capacity = cap;
        s = new Object[capacity];
    }

    //栈中元素数目和判断是否为空以及遍历栈都不能用 s.length
    //因为 s.length 的值始终是 capacity

    /**
     * 返回栈中元素数目
     *
     * @return 栈中元素数目
     */
    @Override
    public int getSize() {
        return (top + 1);
    }

    /**
     * 判断栈是否为空
     *
     * @return true 表示栈非空, false 表示栈空
     */
    @Override
    public boolean isEmpty() {
        return (top < 0);
    }

    /**
     * 使对象加入栈顶
     *
     * @param e 将要加入栈顶的对象
     */
    @Override
    public void push(E e) {
        if (getSize() == capacity) {
            throw new ArrayStackFullException();
        }
        top++;
        s[top] = e;
    }

    @SuppressWarnings("unchecked")
    E elementData(int index) {
        return (E) s[index];
    }

    /**
     * 栈非空, 移除并返回栈顶元素
     * 栈空, 抛出 StackEmptyException
     *
     * @return 栈顶元素
     * @throws StackEmptyException 栈空异常
     */
    @Override
    public E pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        E ele = elementData(top);
        s[top] = null;
        top--;
        return ele;
    }

    /**
     * 栈非空, 返回栈顶元素
     * 栈空, 抛出 StackEmptyException
     *
     * @return 栈顶元素
     * @throws StackEmptyException 栈空异常
     */
    @Override
    public E top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return elementData(top);
    }

    /**
     * 从栈顶开始遍历栈中所有元素
     */
    @Override
    public void traversal() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        for (int i = top; i > 0; i--) {
            System.out.print(s[i] + ", ");
        }
        System.out.println(s[0]);
    }
}
