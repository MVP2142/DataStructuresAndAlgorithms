package com.tan.structure.linklist;

import java.util.Stack;

public class SingleLinkList {

    //链表反转
    public static Node reverse(Node list) {
        Node currentNode = list;
        Node reverseHead = null;
        Node previousNode = null;

        while (currentNode != null) {
            Node nextNode = currentNode.getNext();
            if (nextNode == null) {
                reverseHead = currentNode;
            }
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return reverseHead;
    }

    //用栈链表反转
    public static Node reverseWithStack(Node head) {
        if (head == null) {
            return null;
        }

        Node cur = head;
        if (cur.getNext() == null) {
            return cur;
        }

        Stack<Node> stack = new Stack<Node>();
        while (cur.getNext() != null) {
            stack.push(cur);
            cur = cur.getNext();
        }
        Node rHead = cur;
        while (!stack.empty()) {
            cur.setNext(stack.pop());
            cur = cur.getNext();
        }
        cur.setNext(null);
        return rHead;
    }

    //检查链表是否有环
    public static boolean checkCircle(Node head) {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.getNext();
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static class Node {
        private int data;
        private Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
