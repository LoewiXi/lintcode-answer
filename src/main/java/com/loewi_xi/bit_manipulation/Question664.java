package com.loewi_xi.bit_manipulation;

/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number
 * of 1's in their binary representation and return them as an array.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11 0011.
 */
public class Question664 {

    /**
     * @param num: a non negative integer number
     * @return an array represent the number of 1's in their binary
     */
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
