package com.tan.structure.exercise.one;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DynamicArray2Test {

    @Test
    public void test1() {
        DynamicArray2 array = new DynamicArray2(5);
        Assert.assertTrue(array.put(1));
        Assert.assertTrue(array.put(2));
        Assert.assertTrue(array.put(3));
        Assert.assertTrue(array.put(4));
        Assert.assertTrue(array.put(5));
        System.out.print("test1:\t");
        array.print();
        Assert.assertFalse(array.put(6));
    }

    @Test
    public void test2() {
        DynamicArray2 array = new DynamicArray2(5);
        Assert.assertTrue(array.put(1));
        Assert.assertTrue(array.put(2));
        Assert.assertTrue(array.put(3));
        Assert.assertTrue(array.put(4));
        Assert.assertTrue(array.put(3,5));
        System.out.print("test2:\t");
        array.print();
        assertEquals(4, array.pop());
        array.print();
        assertEquals(3, array.pop(2));
        array.print();
        assertEquals(1, array.pop(0));
        array.print();
        Assert.assertTrue(array.put(0,6));
        array.print();
        Assert.assertTrue(array.update(0,7));
        array.print();
    }

}