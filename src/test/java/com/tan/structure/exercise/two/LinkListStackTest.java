package com.tan.structure.exercise.two;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkListStackTest {

    @Test
    public void test() {
       LinkListStack stack = new LinkListStack();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.print();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
        try {
            stack.pop();
        } catch (RuntimeException e) {
            assertEquals("stack is empty", e.getMessage());
        }
        stack.print();
    }

}