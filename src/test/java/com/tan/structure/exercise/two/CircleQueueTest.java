package com.tan.structure.exercise.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleQueueTest {

    @Test
    public void test() {
        CircleQueue queue = new CircleQueue(6);
        assertTrue(queue.enqueue("1"));
        assertTrue(queue.enqueue("2"));
        assertTrue(queue.enqueue("3"));
        assertTrue(queue.enqueue("4"));
        assertTrue(queue.enqueue("5"));
        assertEquals("1", queue.dequeue());
        assertEquals("2", queue.dequeue());
        assertTrue(queue.enqueue("6"));
        assertTrue(queue.enqueue("7"));
        assertEquals("3", queue.dequeue());
        assertEquals("4", queue.dequeue());
        assertEquals("5", queue.dequeue());
        assertEquals("6", queue.dequeue());
    }

}