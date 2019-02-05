package com.tan.structure.linklist;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleLinkListTest {

    @Test
    public void testReverseStackWithNull() {
        SingleLinkList.Node head = null;
        SingleLinkList.Node result = SingleLinkList.reverseWithStack(head);
        assertNull(result);
    }

    @Test
    public void testReverseStackWithOneNode() {
        SingleLinkList.Node head = new SingleLinkList.Node(1);
        SingleLinkList.Node result = SingleLinkList.reverseWithStack(head);
        assertEquals(head, result);
    }

    @Test
    public void testReverseStackNormal() {
        SingleLinkList.Node head1 = new SingleLinkList.Node(1);
        SingleLinkList.Node head2 = new SingleLinkList.Node(2);
        SingleLinkList.Node head3 = new SingleLinkList.Node(3);
        head1.setNext(head2);
        head2.setNext(head3);

        SingleLinkList.Node result = SingleLinkList.reverseWithStack(head1);
        assertEquals(result, head3);
        result = result.getNext();
        assertEquals(result, head2);
        result = result.getNext();
        assertEquals(result, head1);
        assertNull(result.getNext());
    }

    @Test
    public void testReverseWithNull() {
        SingleLinkList.Node head = null;
        SingleLinkList.Node result = SingleLinkList.reverse(head);
        assertNull(result);
    }

    @Test
    public void testReverseWithOneNode() {
        SingleLinkList.Node head = new SingleLinkList.Node(1);
        SingleLinkList.Node result = SingleLinkList.reverse(head);
        assertEquals(head, result);
    }

    @Test
    public void testReverseNormal() {
        SingleLinkList.Node head1 = new SingleLinkList.Node(1);
        SingleLinkList.Node head2 = new SingleLinkList.Node(2);
        SingleLinkList.Node head3 = new SingleLinkList.Node(3);
        head1.setNext(head2);
        head2.setNext(head3);

        SingleLinkList.Node result = SingleLinkList.reverse(head1);
        assertEquals(result, head3);
        result = result.getNext();
        assertEquals(result, head2);
        result = result.getNext();
        assertEquals(result, head1);
        assertNull(result.getNext());
    }

    @Test
    public void testCircleWithNull() {
        SingleLinkList.Node head = null;
        boolean result = SingleLinkList.checkCircle(head);
        assertFalse(result);
    }

    @Test
    public void testCircleWithSizeOne() {
        SingleLinkList.Node head = new SingleLinkList.Node(1);
        boolean result = SingleLinkList.checkCircle(head);
        assertFalse(result);
    }

    @Test
    public void testCircle1() {
        SingleLinkList.Node head1 = new SingleLinkList.Node(1);
        SingleLinkList.Node head2 = new SingleLinkList.Node(2);
        SingleLinkList.Node head3 = new SingleLinkList.Node(3);
        head1.setNext(head2);
        head2.setNext(head3);

        boolean result = SingleLinkList.checkCircle(head1);
        assertFalse(result);
    }

    @Test
    public void testCircle2() {
        SingleLinkList.Node head1 = new SingleLinkList.Node(1);
        SingleLinkList.Node head2 = new SingleLinkList.Node(2);
        head1.setNext(head2);
        head2.setNext(head1);

        boolean result = SingleLinkList.checkCircle(head1);
        assertTrue(result);
    }

    @Test
    public void testCircle3() {
        SingleLinkList.Node head1 = new SingleLinkList.Node(1);
        SingleLinkList.Node head2 = new SingleLinkList.Node(2);
        SingleLinkList.Node head3 = new SingleLinkList.Node(3);
        head1.setNext(head2);
        head2.setNext(head3);
        head3.setNext(head1);

        boolean result = SingleLinkList.checkCircle(head1);
        assertTrue(result);
    }

}