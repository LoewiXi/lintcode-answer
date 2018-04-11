package com.loewi_xi.bit_manipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Question1.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11 0011.
 */
public class Question1Test {

    @Test
    public void test1() {
        Question1 question = new Question1();
        assertEquals(3, question.aplusb(1, 2));
    }

    @Test
    public void test2() {
        Question1 question = new Question1();
        assertEquals(100, question.aplusb(30, 70));
    }

    @Test
    public void test3() {
        Question1 question = new Question1();
        assertEquals(0, question.aplusb(100, -100));
    }
}
