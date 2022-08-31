package com.bridgelabs;

import java.util.LinkedList;

public class SimpleLinkedList<K> {
    Node<K> head, tail;
    public void push(K key){
        Node<K> newNode = new Node<>(key);
        if (head != null) {
            head.next = newNode;
        }
        head = newNode;
    }
}
