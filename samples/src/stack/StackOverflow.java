package stack;

/**
 * Java 栈溢出
 * <p>
 * 当方法栈的请求深度大于虚拟机所允许的最大深度，则抛出 StackOverflowError 异常
 * <p>
 * VM Args: -Xss128k
 * <p>
 * -Xss: 设置每个线程的堆栈大小
 */
public class StackOverflow {

    private int stackLength;

    @SuppressWarnings("InfiniteRecursion")
    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOverflow so = new StackOverflow();
        try {
            so.stackLeak();
        } catch (StackOverflowError e) {
            System.out.println(so.stackLength);
//            throw e;
        }
    }
}
