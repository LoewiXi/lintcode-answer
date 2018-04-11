package com.loewi_xi.bit_manipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Question365.
 * <p>
 * <br>
 * Created by loewi_xi on 2018/4/11 0011.
 */
public class Question365Test {

    @Test
    public void test1() {
        Question365 question = new Question365();
        assertEquals(1, question.countOnes(32));
    }

    @Test
    public void test2() {
        Question365 question = new Question365();
        assertEquals(2, question.countOnes(5));
    }

    @Test
    public void test3() {
        Question365 question = new Question365();
        System.out.println(question.countOnes(1023));
        assertEquals(10, question.countOnes(1023));
    }
}
