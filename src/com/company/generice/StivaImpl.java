package com.company.generice;

public class StivaImpl<T> implements Stiva<T>{
    private Node<T> top=null;
    @Override
    public void push(T data) {


         if(top==null){
             top=new Node<>();
             top.setData(data);
         }else{
             Node<T> nou= new Node<>();
             nou.setData(data);
             nou.setNext(top);
             top=nou;
         }
    }

    @Override
    public void pop() {
        //sterge primul element din lista

        top=top.getNext();


    }

    @Override
    public T peek() {
        //returneaza ultimul element
        return top.getData();

    }

    @Override
    public void display() {
        Node <T> aux=top;
        while (aux!=null){
            System.out.println(aux.getData());
            aux=aux.getNext();
        }


    }
}
