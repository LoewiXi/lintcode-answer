package com.loewi_xi.bit_manipulation;

/**
 * Using O(1) time to check whether an integer n is a power of 2.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11.
 */
public class Question142 {

    /**
     * @param n: An integer
     * @return True or false
     */
    public boolean checkPowerOf2(int n) {
        return (n & (n - 1)) == 0 && n > 0;
    }

    // 2次方数字，在二进制中表示为1开头，后面接随意个数的0
    // 而2次方数字减去1后的0开头，后面接随意个数的1
    // 这两个数字进行&运算必定得0
    //
    // 当然负数都不为2次方数
}
