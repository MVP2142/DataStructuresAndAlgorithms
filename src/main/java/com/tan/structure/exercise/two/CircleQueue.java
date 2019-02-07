package com.tan.structure.exercise.two;

/**
 * 循环队列
 */
public class CircleQueue {

    private String[] array;
    private int n;
    private int head;
    private int tail;

    public CircleQueue(int val) {
        array = new String[val];
        n = val;
        head = tail = 0;
    }

    public boolean enqueue(String str) {
        int newHead = (head + 1) % n;
        if (newHead == tail) {
            return false;
        }
        array[head] = str;
        head = newHead;
        return true;
    }

    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String r = array[tail];
        array[tail] = null;
        tail = (tail + 1) % n;
        return r;
    }

}
