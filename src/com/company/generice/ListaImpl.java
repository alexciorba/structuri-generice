package com.company.generice;

import org.omg.CORBA.DATA_CONVERSION;

public class ListaImpl <T extends Comparable<T>> implements Lista<T>{


    private Node<T> head=null;
    @Override//adauga la sfarsit
    public void add(T data) {
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
    public void removeIndex(int index) {

    }


    @Override
    public void removeObj(T data) {


    }

    @Override
    public boolean contains(T data) {
        Node<T> aux=head;
        while (aux!=null){
            if(aux.getData().equals(data)){
                return true;

            }
            aux=aux.getNext();
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(head==null){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        int cont=0;
        Node <T> aux=head;
        while (aux!=null){
            cont++;
            aux=aux.getNext();
        }
        return cont;
    }

    @Override
    public int indexOf(T data) {
        return 0;
    }

    @Override
    public T get(int index) {
        Node <T> aux=head;
        for(int i=0;i<index;i++){
            aux=aux.getNext();
        }
        return aux.getData();
    }

    @Override
    public void set(T data, int index) {

        Node <T> aux=head;
        for(int i=0;i<index;i++){
            aux=aux.getNext();
        }
        aux.setData(data);

    }

    @Override
    public Node<T> iterator() {
        return this.head;
    }


    ///

    public T maxim(){

        T data=head.getData();

        Node<T> aux=head;

        while(aux!=null){

            if(aux.getData().compareTo(data)>0){

                data=aux.getData();
            }
        }

        return   data;
    }


}
