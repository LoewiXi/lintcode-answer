package com.loewi_xi.bit_manipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Question181.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11.
 */
public class Question181Test {

    @Test
    public void test1() {
        Question181 question = new Question181();
        assertEquals(2, question.bitSwapRequired(31, 14));
    }
}
