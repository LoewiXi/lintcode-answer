package com.loewi_xi.bit_manipulation;

/**
 * Write a function that add two numbers A and B. You should not use + or any arithmetic operators.
 * Both A and B are 32-bit integers.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11.
 */
public class Question1 {

    /**
     * @param a: An integer
     * @param b: An integer
     * @return The sum of a and b
     */
    public int aplusb(int a, int b) {
        if (b == 0) {
            return a;
        }
        return aplusb(a ^ b, (a & b) << 1);
    }
}
