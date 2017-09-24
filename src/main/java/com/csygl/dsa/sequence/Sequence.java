package com.csygl.dsa.sequence;

/**
 * 序列接口
 */
public interface Sequence {

    /**
     * 获取序列中元素的个数
     * @return 返回序列中元素的个数
     */
    int getSize();

    /**
     * 获取指定位置的元素
     * @param index 下标
     * @return 返回指定下标的元素
     */
    Object getAtRank(int index);

    /**
     * 替换序列中指定位置的元素
     * @param index 被替换元素在序列中的下标
     * @param obj 替换后的元素
     */
    void replaceAtRank(int index, Object obj);

    /**
     * 交换序列中指定两个位置的元素
     * @param p1 被交换元素下标
     * @param p2 被交换元素下标
     */
    void swapByRank(int p1, int p2);

}
