package com.company.datastructures.stack;

public interface IStack<X>{

    boolean isEmpty();

    int size();

    void push(X item);

    X pop();

    X peek();

}
