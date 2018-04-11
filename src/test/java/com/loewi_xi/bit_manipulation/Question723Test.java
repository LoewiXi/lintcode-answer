package com.loewi_xi.bit_manipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Question723.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11 0011.
 */
public class Question723Test {

    @Test
    public void test1() {
        Question723 question = new Question723();
        assertEquals(1968, question.leftRotate(123, 4));
    }
}
