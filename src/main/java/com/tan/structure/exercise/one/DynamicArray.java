package com.tan.structure.exercise.one;

/**
 * 支持动态扩容的数组
 */
public class DynamicArray {

    private int[] array;
    private int index;

    public DynamicArray(int k) {
        this.array = new int[k];
        index = 0;
    }

    public void put(int k) {
        if (array.length < index + 1) {
            int[] temp = array;
            array = new int[2*array.length];
            for (int i = 0 ; i < index ; i++) {
                array[i] = temp[i];
            }
        }
        array[index] = k;
        index++;
    }

    public int[] getList() {
        return array;
    }

    public void print() {
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

}
