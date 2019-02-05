package com.tan.structure.exercise.one;

public class DoubleLinkList {

    Node head;
    Node tail;

    public void addNode(int v) {
        if (head == null) {
            tail = head = new Node(v);
        } else {
            Node target = head;
            while (target.next != null) {
                target = target.next;
            }
            target.next = new Node(v);
            target.next.prev = target;
            tail = target.next;
        }
    }

    public void deleteFirstNode() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                head = head.next;
            }
        }
    }

    public void deleteLastNode() {
        if (head != null) {
            Node target = head;
            while (target.next != null && target.next.next != null) {
                target = target.next;
            }
            target.next = null;
        }
    }

    public void print() {
        System.out.print("[");
        Node target = head;
        while (target != null) {
            System.out.print(target.val + " ");
            target = target.next;
        }
        System.out.println("]");
    }

    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
}
