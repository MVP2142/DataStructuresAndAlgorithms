package com.tan.structure.exercise.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void test1() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(2, fibonacci.get1(3));
        assertEquals(3, fibonacci.get1(4));
        assertEquals(5, fibonacci.get1(5));
        assertEquals(8, fibonacci.get1(6));
    }

    @Test
    public void test2() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(2, fibonacci.get2(3));
        assertEquals(3, fibonacci.get2(4));
        assertEquals(5, fibonacci.get2(5));
        assertEquals(8, fibonacci.get2(6));
    }

}