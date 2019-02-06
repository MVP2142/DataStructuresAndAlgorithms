package com.tan.structure.exercise.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void test1() {
        ArrayStack stack = new ArrayStack(5);
        stack.push(-1);
        stack.push(-2);
        stack.push(-3);
        stack.push(-4);
        assertTrue(stack.push(-5));
        assertFalse(stack.push(-6));
        stack.print();
        assertEquals(-5, stack.pop());
        assertEquals(-4, stack.pop());
        assertEquals(-3, stack.pop());
        assertEquals(-2, stack.pop());
        assertEquals(-1, stack.pop());
        try {
            assertEquals(-5, stack.pop());
        } catch (RuntimeException e) {
            assertEquals("stack is empty", e.getMessage());
        }
        stack.print();
    }

}