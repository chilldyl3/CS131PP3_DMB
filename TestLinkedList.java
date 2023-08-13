package main;

import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;

public class TestLinkedList {

    public static void main(String[] args) {
        
        GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
        GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
        GenericLinkedList<String> stringList = new GenericLinkedList<>();

        GenericNode<Integer> intNode = new GenericNode<>();
        intNode.setData(42);
        integerList.addNode(intNode);

        GenericNode<Double> doubleNode = new GenericNode<>();
        doubleNode.setData(3.14);
        doubleList.addNode(doubleNode);

        GenericNode<String> stringNode = new GenericNode<>();
        stringNode.setData("Hello, GenericLinkedList!");
        stringList.addNode(stringNode);

        printList(integerList);
        printList(doubleList);
        printList(stringList);
    }

    private static <T> void printList(GenericLinkedList<T> list) {
        GenericNode<T> tempNode = list.getList();
        while (tempNode != null) {
            System.out.println(tempNode.getData());
            tempNode = tempNode.getNextNode();
        }
        System.out.println("----------");
    }
}

