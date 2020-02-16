package com.company.datastructures.list;

public class LinkedListImpl<X> implements LinkedList<X> {

    private Node head;
    private Node tail;
    private int nodeCount;

    public LinkedListImpl() {
        head = null;
        tail = null;
        nodeCount = 0;
    }

    @Override
    public void add(X item) {
        if(head == null) {
            head = new Node(item);
            tail = head;
        } else {
            Node newNode = new Node(item);
            tail.nextNode = newNode;
            tail = newNode;
        }
        nodeCount++;
    }

    @Override
    public void insert(X item, int position) {

        Node currentNode = head;

        for (int i = 1; i < position && currentNode.nextNode != null ; i++) {
            currentNode = currentNode.nextNode;
        }

        Node newNode = new Node(item);
        Node nextNode = currentNode.nextNode;

        currentNode.nextNode = newNode;
        newNode.nextNode = nextNode;
        nodeCount++;
    }

    @Override
    public X removeAt(int position) {
        Node currentNode = head;
        Node previousNode = null;

        for (int i = 1; i < position && currentNode.nextNode != null; i++) {
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        previousNode.nextNode = currentNode.nextNode;


        nodeCount--;
        return currentNode.item;
    }

    @Override
    public X remove() {

        if(head == null) {
            throw new IllegalStateException("The LinkedList is empty and there are no items to remove");
        }
        X item = head.item;

        head = head.nextNode;
        nodeCount--;
        return item;
    }

    @Override
    public int find(X item) {

        int count = 0;
        if (nodeCount == 0){
            return 0;
        } else {
            Node currentNode = head;
            while(currentNode.nextNode != null) {
                
                if(item.equals(currentNode.item)) {
                    return count;
                }
                
                currentNode = currentNode.nextNode;
                count++;
            }
        }
        
        return 0;
    }

    @Override
    public X get(int position) {

        int counter = 0;

        Node currentNode = head;
        
        X item = null;
        while(currentNode.nextNode != null) {
            if(position == counter) {
                item = currentNode.item;
            }
            currentNode = currentNode.nextNode;
            counter++;
        }

        return item;
    }

    @Override
    public int size() {
        return nodeCount;
    }

    class Node{
        Node nextNode;
        X item;
        Node(X item) {
            this.item = item;
        }
    }

    //useful for pretty print
    public String toString() {
        StringBuilder contents = new StringBuilder();
        Node curNode = head;

        while(curNode != null) {
            contents.append(curNode.item);
            curNode = curNode.nextNode;

            if(curNode != null) {
                contents.append(", ");
            }
        }
        return contents.toString();
    }

}
