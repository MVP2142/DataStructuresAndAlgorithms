package com.tan.structure.exercise.one;

/**
 * 大小固定支持动态增删改操作的数组
 */
public class DynamicArray2 {

    private int[] array;
    private int index;

    public DynamicArray2(int n) {
        array = new int[n];
        index = 0;
    }

    public boolean put(int v) {
        if (array.length - 1 >= index) {
            array[index] = v;
            index++;
            return true;
        }
        return false;
    }

    public boolean put(int k, int v) {
        if (array.length - 1 >= index) {
            for (int i = index ; i > k ; i--) {
                array[i] = array[i-1];
            }
            array[k] = v;
            index++;
            return true;
        }
        return false;
    }

    public int pop() {
        return array[--index];
    }

    public int pop(int k) {
        int temp = array[k];
        index--;
        for (int i = k ; i < index ; i++) {
            array[i] = array[i+1];
        }
        return temp;
    }

    public boolean update(int k , int v) {
        array[k] = v;
        return true;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0 ; i < index ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

}
