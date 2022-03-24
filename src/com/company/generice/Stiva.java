package com.company.generice;

public interface Stiva<T> {

    void push(T data);
    void pop();
    T peek();
    void display();
    boolean isEmpty();

}
