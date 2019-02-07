package com.tan.structure.exercise.two;

/**
 * 阶乘
 */
public class Factorial {

    public int get(int val) {
        if (val == 1) {
            return 1;
        }
        return val * get(val-1);
    }

}
