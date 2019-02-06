package com.tan.structure.exercise.two;

/**
 * 数组实现的顺序栈
 */
public class ArrayStack {

    private int[] array;
    private int index;

    public ArrayStack(int depth) {
        array = new int[depth];
        index = 0;
    }

    public boolean push(int val) {
        if (index < array.length) {
            array[index] = val;
            index++;
            return true;
        }
        return false;
    }

    public int pop() {
        if (index > 0) {
            index--;
            return array[index];
        }
        throw new RuntimeException("stack is empty");
    }

    public void print() {
        for (int i = array.length; i > 0 ; i--) {
            System.out.print(i + ": ");
            if (i <= index) {
                System.out.println(array[i - 1]);
            } else {
                System.out.println("");
            }
        }
    }

}
