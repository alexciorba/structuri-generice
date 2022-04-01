package com.company.collections_java;

import com.company.comparatori.ComparatorMasinaCuloare;
import com.company.comparatori.ComparatorMasinaMarca;
import com.company.generice.Lista;
import com.company.model.Masina;

import java.util.*;

public class ListExemples {


    public  void ex1(){

        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);

        //parcurgere lista

        Iterator<Masina> iterator=masini.iterator();

        while (iterator.hasNext()){

             Masina m=iterator.next();

            System.out.println(m);
        }


    }

    public void ex2(int index){
        //stergerea unui element

        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);

        Iterator<Masina>iterator=masini.iterator();
        int contor=0;
        while (iterator.hasNext()&&contor!=index ){
           iterator.next();
           contor++;

        }
        iterator.remove();
        while (iterator.hasNext()){

            Masina m=iterator.next();
        System.out.println(m);

    }
    }

    public void ex3(){
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);

        Collections.sort(masini,new ComparatorMasinaMarca());

        int index= Collections.binarySearch(masini,audi,new ComparatorMasinaMarca());


        System.out.println(index);
    }

    public void ex4(){
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");

        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);

        Collections.reverse(masini);
        Iterator<Masina>iterator=masini.iterator();
        while (iterator.hasNext()){

            Masina m=iterator.next();
            System.out.println(m);

        }

    }
    public void ex5(){
        //maximul
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);

        Masina max=Collections.max(masini,new ComparatorMasinaMarca());
        System.out.println(max);


    }
    public void ex6(){
        //frecventa
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);
        masini.add(ford);

        int frecventa=Collections.frequency(masini,ford);
        System.out.println(frecventa);

    }

    public void ex7(){
        //replaceAll
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);
        Collections.replaceAll(masini,ford,audi);

        Iterator<Masina>iterator=masini.iterator();
        while (iterator.hasNext()){

            Masina m=iterator.next();
            System.out.println(m);

        }
    }

    public void ex8(){
        //reverse
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);
        Collections.reverse(masini);
        Iterator<Masina>iterator=masini.iterator();
        while (iterator.hasNext()){

            Masina m=iterator.next();
            System.out.println(m);

        }

    }
    public void ex9(){
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);
        Collections.rotate(masini,2);
        Iterator<Masina>iterator=masini.iterator();
        while (iterator.hasNext()){

            Masina m=iterator.next();
            System.out.println(m);

        }
    }

    public void ex10(){
        //shuffle the elements
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);
        Collections.shuffle(masini);
        Iterator<Masina>iterator=masini.iterator();
        while (iterator.hasNext()){

            Masina m=iterator.next();
            System.out.println(m);

        }

    }
    public void ex11(){
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);
        Collections.sort(masini,new ComparatorMasinaMarca());
        Iterator<Masina>iterator=masini.iterator();
        while (iterator.hasNext()){

            Masina m=iterator.next();
            System.out.println(m);

        }

    }
    public void ex12(){
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);
        Collections.swap(masini,0,3);
        Iterator<Masina>iterator=masini.iterator();
        while (iterator.hasNext()){

            Masina m=iterator.next();
            System.out.println(m);

        }
    }
    public void ex13(){
        List<Masina> masini= new ArrayList<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masini.add(ford);
        masini.add(audi);
        masini.add(ferrari);
        masini.add(bmw);
        Collections.sort(masini,new ComparatorMasinaCuloare());
        Iterator<Masina>iterator=masini.iterator();
        while (iterator.hasNext()){

            Masina m=iterator.next();
            System.out.println(m);

        }
    }

    }





