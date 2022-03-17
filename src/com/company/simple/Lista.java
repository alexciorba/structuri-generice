package com.company.simple;


import com.company.comparatori.ComparatorMasinaCuloare;
import com.company.comparatori.ComparatorMasinaMarca;
import com.company.model.Masina;

public class Lista {


     private Node head=null;

     //todo add


    public void addStart(Masina m){

        if(head==null){
            head= new Node(m,null);

        }else{
            Node node= new Node(m,head);

            head=node;

        }
    }


    //todo addSfarsit

  public void addSfarsit(Masina m){

      if(head==null){
          head= new Node(m,null);

      }else{

          Node aux=head;
          while (aux.getNext()!=null){

               aux=aux.getNext();
          }

          Node nou = new Node(m,null);

          aux.setNext(nou);

      }


  }



    //todo traverse
    public void afisare(){

        Node aux=head;
        while(aux!=null ){

            System.out.println(aux.getData());

            aux=aux.getNext();
        }
    }

    //todo stergerea

    public void stergereStart() {
        head.setNext(head.getNext());

    }

    //todo stergere final

    public void stergereFinal(){
        Node aux=head;
        while (aux.getNext().getNext()!=null){

            aux=aux.getNext();
        }

        aux.setNext(null);
    }


   //todo stergere pozitie

    public void stergerePozitie(int position){


        if(position==0){

            this.stergereStart();
        }else if(position>0&&position<size()-1){


              Node aux=head;

              int count=0;

              while (count!=position-1){

                   count++;
                   aux=aux.getNext();
              }
              aux.setNext(aux.getNext().getNext());

        }else{

            this.stergereFinal();
        }

    }


    //todo addPosition


    public void addPozitie(Masina m, int poz){
        int cont=0;
        if(head==null){
            head=new Node(m,null);

        }else{


            Node aux=head;
            while (aux!=null&&cont!=poz-1){
                cont++;

                aux=head.getNext();

            }

            Node nou = new Node(m,aux.getNext());


            aux.setNext(nou);




        }



    }

    //todo: contains
//
//    public boolean contains(Masina masina){
//        Node aux=head;
//        while (aux!=null){
//            if(aux.getData().equals(masina)){
//                return true;
//            }
//        }return false;
//
//    }

    //todo : is empty

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else {
            return false;
        }
    }



    //todo : size
//    public int size(){
//        Node aux=head;
//        int cont=0;
//        while (aux!=null){
//            cont++;
//            }
//        return cont;
//
//    }


    //todo : o funtie care imi zice cate noduri sunt in lista

    public int size(){
        int cont=0;
        Node aux=head;
        while (aux!=null){
            cont++;

            aux=aux.getNext();
        }
        return cont;
    }



    //todo : get masina
    //todo : set masina

    public Masina getMasina(int position){
        Node aux=head;
        for(int i=0;i<=position-1;i++){
            aux=aux.next;
        }
        return aux.getData();
    }


    public void setMasina(Masina masina,int position){
        Node aux=head;
        for (int i=0;i<position;i++){
            aux=aux.next;
        }
        aux.setData(masina);
    }


    //todo: sortare lista

    public void sort(){


          boolean flag;

          do{

              flag=false;


              for(int i=0;i<this.size()-1;i++){

                  if(this.getMasina(i).compareTo(this.getMasina(i+1))>0){

                      Masina aux=this.getMasina(i);

                      this.setMasina(getMasina(i+1),i);

                      this.setMasina(aux,i+1);

                      flag=true;


                  }
              }



          }while (flag==true);

    }

    //todo: sortare compare Marca

    public void sortCompareMarca(){

        boolean flag=false;
        do{
            flag=false;
            for(int i=0;i<this.size()-1;i++){
                if(new ComparatorMasinaMarca().compare(this.getMasina(i),this.getMasina(i+1))>0){
                    Masina aux=this.getMasina(i);

                    this.setMasina(getMasina(i+1),i);

                    this.setMasina(aux,i+1);

                    flag=true;
                }
            }
        }while (flag==true);
    }

    //todo:sortare compare Model


    public void sortCompare(){
        boolean flag=false;
        do{
            flag=false;
            for(int i=0;i<this.size()-1;i++){
                if(new ComparatorMasinaCuloare().compare(this.getMasina(i),this.getMasina(i+1))>0){
                    Masina aux=this.getMasina(i);

                    this.setMasina(getMasina(i+1),i);

                    this.setMasina(aux,i+1);

                    flag=true;
                }
            }
        }while (flag==true);
    }
}


