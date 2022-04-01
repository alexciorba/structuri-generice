package com.company.collections_java;

import com.company.generice.Coada;
import com.company.generice.CoadaImpl;
import com.company.generice.Lista;
import com.company.generice.ListaImpl;
import com.company.model.Masina;

import java.util.*;

public class QueueExamples {
    public void ex1() {


        Queue<Masina> masinas= new ArrayDeque<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masinas.add(ford);
        masinas.add(audi);
        masinas.add(ferrari);
        masinas.add(bmw);


        // parcurgere coada
        Iterator<Masina>iterator=masinas.iterator();
        while (iterator.hasNext()){
            Masina m=iterator.next();
            System.out.println(m);
        }





    }
}
