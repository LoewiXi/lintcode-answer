package com.loewi_xi.bit_manipulation;

/**
 * Determine the number of bits required to flip if you want to convert integer n to integer m.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11.
 */
public class Question181 {

    /**
     * @param a: An integer
     * @param b: An integer
     * @return An integer
     */
    public int bitSwapRequired(int a, int b) {
        a = a ^ b;
        b = 0;
        if (a < 0) {
            b = 1;
            a = a ^ 0x80000000;
        }
        while (a > 0) {
            b += a & 1;
            a = a >> 1;
        }
        return b;
    }
}
