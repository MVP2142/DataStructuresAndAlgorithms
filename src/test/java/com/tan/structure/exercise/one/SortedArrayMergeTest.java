package com.tan.structure.exercise.one;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedArrayMergeTest {

    @Test
    public void test() {
        SortedArrayMerge sortedArrayMerge = new SortedArrayMerge(4, 6);
        sortedArrayMerge.putA(2);
        sortedArrayMerge.putA(4);
        sortedArrayMerge.putA(5);
        sortedArrayMerge.putA(9);
        sortedArrayMerge.putB(3);
        sortedArrayMerge.putB(5);
        sortedArrayMerge.putB(7);
        sortedArrayMerge.putB(9);
        sortedArrayMerge.putB(11);
        sortedArrayMerge.putB(12);
        sortedArrayMerge.merge();
        sortedArrayMerge.print();
    }

}