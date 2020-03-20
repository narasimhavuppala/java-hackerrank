package com.company.datastructures.stack;

public class Stack {

    private Long[] data = new Long[10];
    private int top = 0;

    public void push(Long i) {
        data[++top] = i;

    }

    public Long pop() {
        return data[top--];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5L);
        System.out.println(stack.pop());
    }

}
