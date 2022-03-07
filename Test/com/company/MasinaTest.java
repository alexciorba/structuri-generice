package com.company;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MasinaTest {

    @Test

    void test1(){
        Masina audi=new Masina(1,"audi","s3",1200,"alb");
        Masina bmw=new Masina(2,"bmw","seria 3",1300,"negru");
        Masina ford=new Masina(3,"ford","focus",13000,"albastru");
        Masina skoda=new Masina(4,"skoda","octavia",23983,"alb");
        Masina citroen=new Masina(5,"citroen", "c3", 3721,"verde");
        Masina masina=new Masina(6,"lambo","urus",2872,"rosu");
        Masina masina2=new Masina(6,"lamborghini","aventador",2872,"rosu");


        System.out.println(new ComparatorMasinaMarca().compare(audi,bmw));
        Lista lista=new Lista();
         lista.addStart(audi);
        lista.addStart(bmw);
        lista.addStart(skoda);
        lista.addStart(ford);

        lista.addStart(citroen);
       // lista.afisare();
        lista.sortCompareMarca();
        lista.afisare();


    }

}