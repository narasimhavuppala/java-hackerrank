package com.company.datastructures.queue;

public interface IQueue<X> {

    int size();

    void enQueue(X item);

    X deQueue();

    boolean isEmpty();

    X front();
}
