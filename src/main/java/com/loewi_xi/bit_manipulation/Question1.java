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

    // explain:
    // 在做加法的时候，首先将相同位的数字进行相加
    // 0+0=0，0+1=1,1+0=1,1+1=0
    // 这样的结果和位运算符(^)相同
    // 所以通过^进行相同位的计算
    //
    // 当1+1=0时，会产生进位，即1+1=10，而其他情况并不产生进位
    // 即0+0=00，1+0=00，0+1=00，1+1=10
    // 所以先通过&运算符计算，之后再左移一位
    //
    // 计算进位之后的结果需要和原结果再进行计算，即重复上述两步步骤直到进位结果为0为止
}
