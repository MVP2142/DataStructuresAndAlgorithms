package com.tan.structure.exercise.one;

/**
 * 支持增删操作的单链表
 */
public class SingleLinkList {

    Node head;

    public void addNode(int v) {
        if (head == null) {
            head = new Node(v);
        } else {
            Node target = head;
            while (target.next != null) {
                target = target.next;
            }
            target.next = new Node(v);
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
            if (head.next != null) {
                Node target = head;
                while (target.next != null && target.next.next != null) {
                    target = target.next;
                }
                target.next = null;
            } else {
                head = null;
            }
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

        public Node(int val) {
            this.val = val;
        }
    }

}
