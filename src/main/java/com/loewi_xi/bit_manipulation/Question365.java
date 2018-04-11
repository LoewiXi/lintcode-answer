package com.loewi_xi.bit_manipulation;

/**
 * Count how many 1 in binary representation of a 32-bit integer.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11.
 */
public class Question365 {

    /**
     * @param num: An integer
     * @return: An integer
     */
    public int countOnes(int num) {
        if (num > 1) {
            return (num & 1) + countOnes(num >> 1);
        }
        if (num > -1) {
            return num;
        }
        return 1 + countOnes(num ^ 0x80000000);
    }
}
