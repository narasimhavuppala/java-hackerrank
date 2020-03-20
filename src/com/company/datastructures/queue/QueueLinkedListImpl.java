package com.company.datastructures.queue;

public class QueueLinkedListImpl<X> implements IQueue<X> {

    Node head ;
    Node tail ;
    int size ;

    public QueueLinkedListImpl() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enQueue(X item) {
        if (head == null) {
            head = new Node(item);
            tail = head;
//            tail.previousNode = null;
        } else {
            Node node = new Node(item);
            tail.previousNode = node;
            tail = node;
//            tail.previousNode.previousNode = null;
        }
        size++;
    }

    @Override
    public X deQueue() {
        if(head == null){
            throw new IllegalStateException("the queue is empty");
        }

        Node currentNode = head;

        if(head.previousNode != null) {
            Node previousNode = head.previousNode;
            head = previousNode;
        } else {
            head = null;
            tail = null;
        }

        size--;

        return currentNode.item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ;
    }

    @Override
    public X front() {
        if(head == null) {
            throw new IllegalStateException("the queue is empty");
        }
        return head.item;
    }

    class Node {
        Node previousNode;
        X item;
        Node(X item) {
            this.item = item;
        }
    }
}
