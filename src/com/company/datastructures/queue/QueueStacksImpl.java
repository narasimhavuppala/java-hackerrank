package com.company.datastructures.queue;

import com.company.datastructures.stack.DynamicStack;
import com.company.datastructures.stack.IStack;

public class QueueStacksImpl<X> implements IQueue<X> {

    IStack<X> stackOne = new DynamicStack<>();
    IStack<X> stackTwo = new DynamicStack<>();

    @Override
    public int size() {
        return stackOne.size() + stackTwo.size();
    }

    @Override
    public void enQueue(X item) {
        stackOne.push(item);
    }

    @Override
    public X deQueue() {
        if(stackTwo.isEmpty()) {
            while(!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }

        return stackTwo.pop();
    }

    @Override
    public boolean isEmpty() {
        return stackOne.isEmpty() && stackTwo.isEmpty();
    }

    @Override
    public X front() {

        if(stackTwo.isEmpty()) {
            while(!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }
        return stackTwo.peek();
    }
}
