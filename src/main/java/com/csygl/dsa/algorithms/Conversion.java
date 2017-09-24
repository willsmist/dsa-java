package com.csygl.dsa.algorithms;

/**
 * 正整数进制转换
 */
public class Conversion {

    /**
     * 16以内进制所用数字符号
     */
    private static final String num_chars = "0123456789ABCDEF";

    /**
     * 将十进制表示的数字转换为指定进制表示
     *
     * @param sourceNum  原十进制表示的数字
     * @param targetBase 目标进制的基
     * @return 返回目标进制表示的数字，以 String 类型表示
     */
    public String convert(int sourceNum, int targetBase) {
        StringBuilder sb = new StringBuilder();
        while (sourceNum != 0) {
            int remainder = sourceNum % targetBase;
            sb.insert(0, num_chars.charAt(remainder));
            sourceNum /= targetBase;
        }
        return sb.toString();
    }

    /**
     * 将任意指定进制数字转换为任意目标进制表示
     *
     * @param sourceBase 原数字所用进制的基
     * @param sourceNum 指定进制表示的原数字，以 String 类型表示
     * @param targetBase 目标进制的基
     * @return 返回目标进制表示的数字，以 String 类型表示
     */
    public String convert(int sourceBase, String sourceNum, int targetBase) {
        return convert(convertToDec(sourceBase, sourceNum), targetBase);
    }

    /**
     * 将指定进制表示的数字转换为十进制表示
     *
     * @param sourceBase 原数字所用进制的基
     * @param sourceNum  指定进制表示的原数字，以 String 类型表示
     * @return 返回十进制表示的数字
     */
    public int convertToDec(int sourceBase, String sourceNum) {
        int dec = 0;
        for (int i = 0; i < sourceNum.length(); i++) {
            int d = num_chars.indexOf(sourceNum.charAt(i));
            dec += d * Math.pow(sourceBase, sourceNum.length() - 1 - i);
        }
        return dec;
    }
}
