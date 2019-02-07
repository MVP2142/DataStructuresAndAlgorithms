package com.tan.structure.exercise.two;

/**
 * 斐波那契数列
 */
public class Fibonacci {

    private int[] temp;

    public int get1(int index) {
        if (index < 2) {
            throw new RuntimeException("index must larger than 2");
        }
        temp = new int[index];
        temp[0] = 1;
        temp[1] = 1;
        int i = 2;
        for ( ; i <index ; i++) {
            temp[i] = temp[i-1] + temp[i-2];
        }
        return temp[i-1];
    }

    public int get2(int index) {
        if (index == 1 || index == 2) {
            return 1;
        }
        return get2(index-1) + get2(index-2);
    }

}
