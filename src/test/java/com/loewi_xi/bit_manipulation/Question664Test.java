package com.loewi_xi.bit_manipulation;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for Question664.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11 0011.
 */
public class Question664Test {

    @Test
    public void test1() {
        Question664 question = new Question664();
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, question.countBits(5));
    }
}
