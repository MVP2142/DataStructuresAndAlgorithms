package com.tan.structure.linklist;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinglyLinkListTest {

    @Test
    public void testReverseStackWithNull() {
        SinglyLinkList.Node head = null;
        SinglyLinkList.Node result = SinglyLinkList.reverseWithStack(head);
        assertNull(result);
    }

    @Test
    public void testReverseStackWithOneNode() {
        SinglyLinkList.Node head = new SinglyLinkList.Node(1);
        SinglyLinkList.Node result = SinglyLinkList.reverseWithStack(head);
        assertEquals(head, result);
    }

    @Test
    public void testReverseStackNormal() {
        SinglyLinkList.Node head1 = new SinglyLinkList.Node(1);
        SinglyLinkList.Node head2 = new SinglyLinkList.Node(2);
        SinglyLinkList.Node head3 = new SinglyLinkList.Node(3);
        head1.setNext(head2);
        head2.setNext(head3);

        SinglyLinkList.Node result = SinglyLinkList.reverseWithStack(head1);
        assertEquals(result, head3);
        result = result.getNext();
        assertEquals(result, head2);
        result = result.getNext();
        assertEquals(result, head1);
        assertNull(result.getNext());
    }

    @Test
    public void testReverseWithNull() {
        SinglyLinkList.Node head = null;
        SinglyLinkList.Node result = SinglyLinkList.reverse(head);
        assertNull(result);
    }

    @Test
    public void testReverseWithOneNode() {
        SinglyLinkList.Node head = new SinglyLinkList.Node(1);
        SinglyLinkList.Node result = SinglyLinkList.reverse(head);
        assertEquals(head, result);
    }

    @Test
    public void testReverseNormal() {
        SinglyLinkList.Node head1 = new SinglyLinkList.Node(1);
        SinglyLinkList.Node head2 = new SinglyLinkList.Node(2);
        SinglyLinkList.Node head3 = new SinglyLinkList.Node(3);
        head1.setNext(head2);
        head2.setNext(head3);

        SinglyLinkList.Node result = SinglyLinkList.reverse(head1);
        assertEquals(result, head3);
        result = result.getNext();
        assertEquals(result, head2);
        result = result.getNext();
        assertEquals(result, head1);
        assertNull(result.getNext());
    }

    @Test
    public void testCircleWithNull() {
        SinglyLinkList.Node head = null;
        boolean result = SinglyLinkList.checkCircle(head);
        assertFalse(result);
    }

    @Test
    public void testCircleWithSizeOne() {
        SinglyLinkList.Node head = new SinglyLinkList.Node(1);
        boolean result = SinglyLinkList.checkCircle(head);
        assertFalse(result);
    }

    @Test
    public void testCircle1() {
        SinglyLinkList.Node head1 = new SinglyLinkList.Node(1);
        SinglyLinkList.Node head2 = new SinglyLinkList.Node(2);
        SinglyLinkList.Node head3 = new SinglyLinkList.Node(3);
        head1.setNext(head2);
        head2.setNext(head3);

        boolean result = SinglyLinkList.checkCircle(head1);
        assertFalse(result);
    }

    @Test
    public void testCircle2() {
        SinglyLinkList.Node head1 = new SinglyLinkList.Node(1);
        SinglyLinkList.Node head2 = new SinglyLinkList.Node(2);
        head1.setNext(head2);
        head2.setNext(head1);

        boolean result = SinglyLinkList.checkCircle(head1);
        assertTrue(result);
    }

    @Test
    public void testCircle3() {
        SinglyLinkList.Node head1 = new SinglyLinkList.Node(1);
        SinglyLinkList.Node head2 = new SinglyLinkList.Node(2);
        SinglyLinkList.Node head3 = new SinglyLinkList.Node(3);
        head1.setNext(head2);
        head2.setNext(head3);
        head3.setNext(head1);

        boolean result = SinglyLinkList.checkCircle(head1);
        assertTrue(result);
    }

}