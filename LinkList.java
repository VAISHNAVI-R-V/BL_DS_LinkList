package com.bl.linklist;

public class LinkList {
    // main method
    public static void main(String[] args) {
        LinkedListOperations operations = new LinkedListOperations();
        INode head;

        Node<Integer> myFirstNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(56);

        //Operations to add key
        head = operations.addNode(myFirstNode);
        operations.displayNode(head);
        head = operations.addNode(mySecondNode);
        operations.displayNode(head);
        head = operations.addNode(myThirdNode);
        operations.displayNode(head);
    }
}