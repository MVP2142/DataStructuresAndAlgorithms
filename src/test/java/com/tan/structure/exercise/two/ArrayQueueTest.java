package com.tan.structure.exercise.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayQueueTest {

    @Test
    public void test1() {
        ArrayQueue queue = new ArrayQueue(5);
        assertTrue(queue.enqueue("1"));
        assertTrue(queue.enqueue("2"));
        assertTrue(queue.enqueue("3"));
        assertTrue(queue.enqueue("4"));
        assertTrue(queue.enqueue("5"));
        assertFalse(queue.enqueue("6"));
        assertEquals("1", queue.dequeue());
        assertEquals("2", queue.dequeue());
        assertEquals("3", queue.dequeue());
        assertEquals("4", queue.dequeue());
        assertEquals("5", queue.dequeue());
        assertNull(queue.dequeue());
    }

    @Test
    public void test2() {
        ArrayQueue queue = new ArrayQueue(5);
        assertTrue(queue.enqueue("1"));
        assertTrue(queue.enqueue("2"));
        assertTrue(queue.enqueue("3"));
        assertTrue(queue.enqueue("4"));
        assertTrue(queue.enqueue("5"));
        assertEquals("1", queue.dequeue());
        assertTrue(queue.enqueue("6"));
    }

}