package com.tan.structure.exercise.one;

import org.junit.Test;

public class SingleLinkListTest {

    @Test
    public void test() {
        SingleLinkList linkList = new SingleLinkList();
        linkList.addNode(1);
        linkList.addNode(2);
        linkList.addNode(3);
        linkList.print();
        linkList.deleteFirstNode();
        linkList.print();
        linkList.addNode(4);
        linkList.print();
        linkList.deleteLastNode();
        linkList.print();
        linkList.deleteLastNode();
        linkList.print();
        linkList.deleteLastNode();
        linkList.print();
    }

}