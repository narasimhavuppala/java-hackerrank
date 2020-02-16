package com.company.datastructures.queue;

public interface IQueue<X> {

    int size();

    void enQueue(X item);

    void deQueue(X item);

    boolean isEmpty();

    X front();
}
