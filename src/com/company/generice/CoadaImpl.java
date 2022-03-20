package com.company.generice;

public class CoadaImpl<T> implements Coada<T>{
    private Node<T> head=null;
    @Override
    public void addNode(T data) {

        //add la sfrsit
        //sterge de la cap
        if(head==null){
            head=new Node();

            head.setNext(null);
            head.setData(data);
        }else{
            Node<T> aux=head;
            while (aux.getNext()!=null){
                aux=aux.getNext();
            }
            Node<T> nou=new Node();
            nou.setNext(null);
            nou.setData(data);
            aux.setNext(nou);
        }

    }

    @Override
    public void remove() {
       Node<T> aux=head;
        while (aux.getNext().getNext()!=null){

            aux=aux.getNext();
        }

        aux.setNext(null);
    }

    }

