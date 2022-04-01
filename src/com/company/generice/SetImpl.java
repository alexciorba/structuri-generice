package com.company.generice;
// adaugarea s eface intr-o anumita ordine

public class SetImpl<T extends Comparable<T>> {
    private Node<T> head=null;
    public void add(T data){

        if(head==null){
            head=new Node<>();
            head.setNext(null);
            head.setData(data);
        }else{
            Node<T>aux=head;
            while (aux.getNext()!=null){
                if(aux.getData().compareTo(data)>0){

                }
            }
        }
    }
}
