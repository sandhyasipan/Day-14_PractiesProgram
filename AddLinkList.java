package com.bridgelabs;

public class AddLinkList {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

    }
    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
