package com.company.datastructures.queue;

public class BasicQueue<X> {
    private X[] data;
    private int front;
    private int end;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (X[]) new Object[size];
    }

    public int size() {

        //if the queue is empty return 0
        if(front == -1 && end == -1) {
            return 0;
        } else {
            //otherwise we add one to get the inclusive substraction value rather than excluding
            return end - front + 1;
        }
    }

    public void enQueue(X item) {
        if((end + 1) % data.length == front) {
            throw new IllegalStateException("The Queue is full!");
        }

        if (size() == 0){
            front++;
            end++;
            data[end] = item;
        } else {
            end++;
            data[end] = item;
        }
    }

    public X deQueue() {
        X item = null;
        if(size() == 0) {
            throw new IllegalStateException("Can't dequeue because the queue is empty");
        } else if(front == end) {
            //otherwise if this is the last item on the queue, the queue needs to get reset to empty
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;

    }

    public boolean contains(X item) {

        boolean condition = false;
        if(size() == 0) {
            return condition;
        }

        for (int i = front; i <= end ; i++){
            if(data[i].equals(item)) {
                condition = true;
                break;
            }
        }

        return condition;

    }

    public X access(int position) {
        if(size() == 0 || position > size()) {
            throw new IllegalStateException("Can't because the queue is empty");
        }

        int trueIndex = 0;
        for(int i = front; i < end; i++) {
            if(trueIndex == position) {
                return data[i];
            }
            trueIndex++;
        }
//            return data[position];


        throw new IllegalArgumentException("Could not get queue item at position: " + position);
    }


}
