package stack;

import java.util.ArrayList;

/**
 * Java 堆溢出
 * <p>
 * Java 堆用于存储对象(包括数组)实例，不断创建对象实例
 * 并且保证不会被GC回收(保证GC Roots到对象实例 具有可达)
 * 当创建的对象实例超过堆容量的上限，那么就会发生堆溢出，抛出OutOfMemoryError异常
 * <p>
 * VM Args：-Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 * <p>
 * -Xms: 设置堆的最小值
 * -Xmx: 设置堆的最大值
 * +HeapDumpOnOutOfMemoryError: 虚拟机堆溢出时dump当前内存堆转存快照
 * 当 -Xms 和 -Xmx 参数设置成相等大小时，则Java堆不可自动扩展
 */
public class OutOfMemory {

    private static class OOMObject {

    }

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();
        try {
            while (true) {
                list.add(new OOMObject());
            }
        } catch (OutOfMemoryError e) {//java.lang.OutOfMemoryError: Java heap space
            System.out.println(list.size());
        }
    }
}
