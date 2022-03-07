package com.company;

public class Node {

     Masina data;
     Node next=null;

     public Node() {
     }

     public Node(Masina data, Node next) {
          this.data = data;
          this.next = next;
     }

     public Masina getData() {
          return data;
     }

     public void setData(Masina data) {
          this.data = data;
     }

     public Node getNext() {
          return next;
     }

     public void setNext(Node next) {
          this.next = next;
     }
}
