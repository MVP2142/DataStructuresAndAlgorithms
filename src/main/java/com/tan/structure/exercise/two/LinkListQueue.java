package com.tan.structure.exercise.two;

/**
 * 链表实现链式队列
 */
public class LinkListQueue {

    private Node head;
    private Node tail;

    public Node createNode(String str) {
        return new Node(str);
    }

    public boolean enqueue(String str) {
        if (head == null) {
            head = tail = new Node(str);
        } else {
            tail.next = new Node(str);
            tail = tail.next;
        }
        return true;
    }

    public String dequeue() {
        if (head == null) {
            return null;
        }
        Node r = head;
        if (head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return r.msg;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.msg + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    class Node {
        private String msg;
        private Node next;

        public Node(String msg) {
            this.msg = msg;
        }
    }

}
