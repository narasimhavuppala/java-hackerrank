package com.company.datastructures.stack;

public class DynamicStack<X> implements IStack<X> {

    private X[] data;
    private int size;
    private int top = -1;

    public DynamicStack() {
        data = (X[]) new Object[0];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(X item) {
        resize();
        data[++top] = item;
    }

    @Override
    public X pop() {
        if(size == 0){
            throw new IllegalStateException("Stack is empty, it cannot be pop");
        }
        size--;
        return data[top--];
    }

    @Override
    public X peek() {
        if (size != 0) {
            return data[top];
        } else {
            throw new IllegalStateException("The Stack is empty and there are no items to peek");
        }
    }

    private void resize() {
        X[] newData = (X[]) new Object[++size];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }
}
