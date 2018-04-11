package com.loewi_xi.bit_manipulation;

/**
 * Bit Rotation -—— A rotation (or circular shift) is an operation similar to shift except that the bits that fall off
 * at one end are put back to the other end.
 * <p>
 * In left rotation, the bits that fall off at left end are put back at right end.
 * <p>
 * Let n is stored using 8 bits. Left rotation of n = 　11100101 by 3 makes n = 00101111 (Left shifted by 3 and first
 * 3 bits are put back in last ). If n is stored using 16 bits or 32 bits then left rotation of n (000…11100101)
 * becomes 00..0011100101000.
 * <p>
 * In this problem, you can assume that n was stored in 32 Bits
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11 0011.
 */
public class Question723 {

    /**
     * @param n: a number
     * @param d: digit needed to be rorated
     * @return a number
     */
    public int leftRotate(int n, int d) {
        return n << d | n >>> (32 - d);
    }
}
