package com.tan.structure.exercise.two;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkListQueueTest {

    @Test
    public void test1() {
        LinkListQueue queue = new LinkListQueue();
        assertTrue(queue.enqueue("1"));
        queue.print();
        assertTrue(queue.enqueue("2"));
        queue.print();
        assertTrue(queue.enqueue("3"));
        queue.print();
        assertEquals("1", queue.dequeue());
        queue.print();
        assertEquals("2", queue.dequeue());
        queue.print();
        assertTrue(queue.enqueue("4"));
        queue.print();
        assertEquals("3", queue.dequeue());
        queue.print();
        assertEquals("4", queue.dequeue());
        queue.print();
        assertNull(queue.dequeue());
    }

}