package com.tan.structure.exercise.one;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoubleLinkListTest {

    @Test
    public void test() {
        DoubleLinkList linkList = new DoubleLinkList();
        linkList.addNode(1);
        linkList.addNode(2);
        linkList.addNode(3);
        linkList.print();
    }

}