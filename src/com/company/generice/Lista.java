package com.company.generice;

public interface Lista <T extends Comparable<T>>{


     void add(T data);
     void removeIndex(int index);
     void removeObj(T data);
     boolean contains(T data);
     boolean isEmpty();
     int size();
     int indexOf(T data);
     T get(int index);
     void set(T data ,int index);
     void sortare();

    Node<T> iterator();


}
