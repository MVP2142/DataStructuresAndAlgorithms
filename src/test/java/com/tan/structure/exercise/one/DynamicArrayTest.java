package com.tan.structure.exercise.one;

import org.junit.Assert;
import org.junit.Test;

public class DynamicArrayTest {

    @Test
    public void test() {
        DynamicArray array = new DynamicArray(3);
        array.put(1);
        array.put(2);
        array.put(3);
        array.print();
        Assert.assertEquals(3, array.getList().length);
        array.put(4);
        array.put(5);
        array.put(6);
        array.print();
        Assert.assertEquals(6, array.getList().length);
        array.put(7);
        array.print();
        Assert.assertEquals(12, array.getList().length);
    }

}