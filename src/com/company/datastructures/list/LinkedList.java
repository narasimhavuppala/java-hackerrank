package com.company.datastructures.list;

public interface LinkedList<X> {
    void add(X item);
    void insert(X item, int position);
    X removeAt(int position);
    X remove();
    int find(X item);
    X get(int position);
    int size();
    String toString();
}
