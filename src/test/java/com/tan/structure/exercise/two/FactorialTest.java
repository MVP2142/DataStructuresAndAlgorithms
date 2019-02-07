package com.tan.structure.exercise.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void test() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.get(1));
        assertEquals(2, factorial.get(2));
        assertEquals(6, factorial.get(3));
        assertEquals(24, factorial.get(4));
        assertEquals(120, factorial.get(5));
    }

}