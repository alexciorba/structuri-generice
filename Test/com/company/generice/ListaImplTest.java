package com.company.generice;

import com.company.model.Animal;
import com.company.model.Masina;
import com.company.model.Persoana;
import org.junit.jupiter.api.Test;


class ListaImplTest {


    @Test
    void testAdd(){

         Lista<Masina> masinaLista= new ListaImpl<>();
         Lista<Masina>masinaLista1=new ListaImpl<>();


        Masina audi=new Masina(1,"audi","s3",1200,"alb");
        Masina bmw=new Masina(2,"bmw","seria 3",1300,"negru");
        Masina ford=new Masina(3,"ford","focus",13000,"albastru");
        Masina skoda=new Masina(4,"skoda","octavia",23983,"alb");
        Masina citroen=new Masina(5,"citroen", "c3", 3721,"verde");
        Masina masina=new Masina(6,"lambo","urus",2872,"rosu");

        masinaLista.add(audi);
        masinaLista.add(bmw);
        masinaLista.add(ford);
        masinaLista.add(skoda);
        masinaLista.add(citroen);

        //todo: test add
        Node<Masina> aux=masinaLista.iterator();
        while (aux!=null){
            System.out.println(aux.getData());
            aux=aux.getNext();
        }

        //todo: testeaza contains

        System.out.println(masinaLista.contains(masina));

        //todo:testeaza is empty

        System.out.println(masinaLista.isEmpty());
        System.out.println(masinaLista1.isEmpty());

        //todo: testeaza size

        System.out.println(masinaLista.size());

        //todo : testeaza get

        System.out.println(masinaLista.get(3));

        //todo: testeaza set

        masinaLista.set(masina,0);



    }

    @Test

    void testCompare(){
        Lista<Animal>listaAnimale=new ListaImpl<>();
        Lista<Persoana>listaPersoane=new ListaImpl<>();

    }



}