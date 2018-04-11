package com.loewi_xi.bit_manipulation;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for Question142.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11 0011.
 */
public class Question142Test {

    @Test
    public void test1() {
        Question142 question = new Question142();
        assertTrue(question.checkPowerOf2(4));
    }

    @Test
    public void test2() {
        Question142 question = new Question142();
        assertFalse(question.checkPowerOf2(5));
    }
}
