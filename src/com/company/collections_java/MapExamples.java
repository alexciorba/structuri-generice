package com.company.collections_java;

import com.company.comparatori.ComparatorMasinaCuloare;
import com.company.comparatori.ComparatorMasinaMarca;
import com.company.comparatori.ComparatorPersoanaNume;
import com.company.model.Masina;
import com.company.model.Persoana;

import java.util.*;

public class MapExamples {
    public void ex1(){
        Map<String,Masina> masinaMap=new HashMap<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");


        masinaMap.put("Adrian",ford);
        masinaMap.put("Alex",audi);
        masinaMap.put("Ana",bmw);
        masinaMap.put("Maria",ferrari);

        //afiseam cheile


        Set<String> keys=masinaMap.keySet();

        System.out.println("Keys");
        Iterator<String>iterator=keys.iterator();
        while (iterator.hasNext()){
            String k=iterator.next();
            System.out.println(k);
        }

        //afisam valorile
        Collection<Masina>values=masinaMap.values();

        Iterator<Masina>iterator1= values.iterator();
        while (iterator1.hasNext()){
            Masina v= iterator1.next();
            System.out.println(v);
        }
        //afisam perechi

        Set<Map.Entry<String,Masina>> entries= masinaMap.entrySet();


        Iterator<Map.Entry<String,Masina>>it=entries.iterator();


        while (it.hasNext()){

            Map.Entry<String,Masina> entry=it.next();

            System.out.println(entry.getKey()+":"+entry.getValue());

        }
    }

    public void ex2(){
        Map<String,Masina> masinaMap=new HashMap<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");


        masinaMap.put("Adrian",ford);
        masinaMap.put("Alex",audi);
        masinaMap.put("Ana",bmw);
        masinaMap.put("Maria",ferrari);

        masinaMap.remove("Maria");
    }

    public void ex3(){
        Map<String,Masina> masinaMap=new HashMap<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");


        masinaMap.put("Adrian",ford);
        masinaMap.put("Alex",audi);
        masinaMap.put("Ana",bmw);
        masinaMap.put("Maria",ferrari);

        System.out.println(masinaMap.containsValue(audi));
    }
    public void ex4(){
        Map<String,Masina> masinaMap=new HashMap<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");


        masinaMap.put("Adrian",ford);
        masinaMap.put("Alex",audi);
        masinaMap.put("Ana",bmw);
        masinaMap.put("Maria",ferrari);

        System.out.println(masinaMap.containsKey("Alex"));
    }

    public void ex5(){
        Map<String,Masina> masinaMap=new HashMap<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");


        masinaMap.put("Adrian",ford);
        masinaMap.put("Alex",audi);
        masinaMap.put("Ana",bmw);
        masinaMap.put("Maria",ferrari);
        int s=masinaMap.size();
        System.out.println(s);
    }

    public void ex6(){
        Map<String,Masina> masinaMap=new HashMap<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masinaMap.put("Adrian",ford);
        masinaMap.put("Alex",audi);
        masinaMap.put("Ana",bmw);
        masinaMap.put("Maria",ferrari);
        System.out.println(masinaMap.isEmpty());
    }

    public void ex7(){
        Map<String,Masina> masinaMap=new HashMap<>();
        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");
        masinaMap.put("Adrian",ford);
        masinaMap.put("Alex",audi);
        masinaMap.put("Ana",bmw);
        masinaMap.put("Maria",ferrari);

        //todo : replace

        masinaMap.replace("Adrian",ford,bmw);

        Set<Map.Entry<String,Masina>> entries= masinaMap.entrySet();
        Iterator<Map.Entry<String,Masina>>it=entries.iterator();
        while (it.hasNext()){
            Map.Entry<String,Masina> entry=it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public void ex8(){
        TreeMap<Persoana,Masina>masinaMap=new TreeMap<>(new ComparatorPersoanaNume());
        Persoana ana=new Persoana(21,"ana","maria",12);
        Persoana alex=new Persoana(39,"alex","alx",32);
        Persoana maria=new Persoana(21,"maria","mra",22);
        Persoana adrian=new Persoana(83,"adrian","adr",32);

        Masina ford=new Masina(10,"ford","ranger",3761,"verde");
        Masina audi=new Masina(77,"audi","q7",87988,"alb");
        Masina ferrari=new Masina(872,"ferrari","enzo",2872,"rosu");
        Masina bmw=new Masina(2892,"bmw","x5",287,"negru");

        masinaMap.put(ana,ford);
        masinaMap.put(alex,audi);
        masinaMap.put(maria,ferrari);
        masinaMap.put(adrian,bmw);

        Set<Map.Entry<Persoana,Masina>> entries= masinaMap.entrySet();
        Iterator<Map.Entry<Persoana,Masina>>it=entries.iterator();
        while (it.hasNext()){
            Map.Entry<Persoana,Masina> entry=it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


        System.out.println(masinaMap.firstKey());
        System.out.println(masinaMap.lastEntry());

    }


}
