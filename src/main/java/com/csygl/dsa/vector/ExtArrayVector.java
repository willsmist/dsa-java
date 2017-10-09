package com.csygl.dsa.vector;

public class ExtArrayVector<E> extends ArrayVector<E> {

    private static final int INITCAP = 8;

    private int cap;

    public ExtArrayVector() {
        this(INITCAP);
    }

    public ExtArrayVector(int cap) {
        super(cap);
        this.cap = cap;
    }

    /**
     * 插入对象 e 作为秩为 r 的元素，并返回该元素
     *
     * @param r 秩
     * @param e 对象
     * @return 新插入的元素
     * @throws VectorRankOutOfBoundsException 向量秩越界异常
     */
    @Override
    public E insertAtRank(int r, E e) throws VectorRankOutOfBoundsException {
        if (r < 0 || r > n) {
            throw new VectorRankOutOfBoundsException(r + "");
        }
        if (n >= cap) {
            cap *= 2;
            Object[] t = new Object[cap];
            for (int i = 0; i < n; i++) {
                t[i] = v[i];
            }
            v = t;
        }
        for (int i = n; i > r; i--) {
            v[i] = v[i - 1];
        }
        v[r] = e;
        n++;
        return e;
    }
}
