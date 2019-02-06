package com.tan.structure.exercise.two;

/**
 * 链表实现链式栈
 */
public class LinkListStack {

    private Node head;

    public void push(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }
    }

    public int pop() {
        if (head == null) {
            throw new RuntimeException("stack is empty");
        }
        Node temp = head;
        head = temp.next;
        return temp.val;
    }

    public void print() {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        } else {
            System.out.println("Stack is empty!");
        }
    }

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
