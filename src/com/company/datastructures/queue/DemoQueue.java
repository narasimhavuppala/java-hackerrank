package com.company.datastructures.queue;

public class DemoQueue {

    public static void main(String[] args) {
//        IQueue<String> queue = new QueueStacksImpl<>();
        IQueue<String> queue = new QueueLinkedListImpl<>();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
        System.out.println("Queue empty? " + queue.isEmpty());
        System.out.println("Queue size? " + queue.size());
        System.out.println("Queue front? " + queue.front());


        System.out.println("Dequeue: " +  queue.deQueue());
        System.out.println("Dequeue: " +  queue.deQueue());
//        System.out.println("Dequeue: " +  queue.deQueue());
        System.out.println("Queue empty? " + queue.isEmpty());
        System.out.println("Queue size? " + queue.size());
        System.out.println("Queue front? " + queue.front());
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
        System.out.println("Queue empty? " + queue.isEmpty());
        System.out.println("Queue size? " + queue.size());
        System.out.println("Queue front? " + queue.front());


    }


}
