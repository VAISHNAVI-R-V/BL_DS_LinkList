package com.bl.linklist;

public class Node<K> implements INode<K> {
    K key;
    INode next;

    public Node() {
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public Node(K key) {
        this.key = key;
        this.next = null;


    }
}