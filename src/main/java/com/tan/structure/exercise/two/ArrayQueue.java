package com.tan.structure.exercise.two;

/**
 * 数组实现顺序队列
 */
public class ArrayQueue {

    private String[] array;
    private int n;
    private int head;
    private int tail;

    public ArrayQueue(int val) {
        array = new String[val];
        head = 0;
        tail = 0;
        n = val;
    }

    // public boolean enqueue(String str) {
    //     if (tail == n) {
    //         return false;
    //     }
    //     array[tail] = str;
    //     tail++;
    //     return true;
    // }

    public boolean enqueue(String str) {
        if (tail == n) {
            if (head == 0) {
                return false;
            }
            for (int i = head ; i < tail ; i++) {
                array[i-head] = array[i];
            }
            tail = tail - head;
            head = 0;
        }
        array[tail] = str;
        tail++;
        return true;
    }

    public String dequeue() {
        if (head == tail) {
            return null;
        }
        return array[head++];
    }

}
