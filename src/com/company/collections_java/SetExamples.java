package com.company.collections_java;

import com.company.comparatori.ComparatorMasinaCuloare;
import com.company.model.Masina;

import java.util.*;

public class SetExamples {
    public void ex1() {
        Set<Masina> masinas = new HashSet<>();
        Masina ford = new Masina(10, "ford", "ranger", 3761, "verde");
        Masina audi = new Masina(77, "audi", "q7", 87988, "alb");
        Masina ferrari = new Masina(872, "ferrari", "enzo", 2872, "rosu");
        Masina bmw = new Masina(2892, "bmw", "x5", 287, "negru");
        masinas.add(ford);
        masinas.add(audi);
        masinas.add(ferrari);
        masinas.add(bmw);

        Iterator<Masina>iterator=masinas.iterator();
        while (iterator.hasNext()){
            Masina masina=iterator.next();
            System.out.println(masina);
        }
    }

    public void ex2() {
        Set<Masina> masinas = new TreeSet<>();

        Masina ford = new Masina(10, "ford", "ranger", 3761, "verde");
        Masina audi = new Masina(77, "audi", "q7", 87988, "alb");
        Masina ferrari = new Masina(872, "ferrari", "enzo", 2872, "rosu");
        Masina bmw = new Masina(2892, "bmw", "x5", 287, "negru");
        masinas.add(ford);
        masinas.add(audi);
        masinas.add(ferrari);
        masinas.add(bmw);
        masinas.add(ford);
        Iterator<Masina>iterator=masinas.iterator();
        while (iterator.hasNext()){
            Masina masina=iterator.next();
            System.out.println(masina);
        }
    }

    public void ex3(){
        Set<Masina> masinas = new TreeSet<>(new ComparatorMasinaCuloare());

        Masina ford = new Masina(10, "ford", "ranger", 3761, "verde");
        Masina audi = new Masina(77, "audi", "q7", 87988, "alb");
        Masina ferrari = new Masina(872, "ferrari", "enzo", 2872, "rosu");
        Masina bmw = new Masina(2892, "bmw", "x5", 287, "negru");
        masinas.add(ford);
        masinas.add(audi);
        masinas.add(ferrari);
        masinas.add(bmw);
        Iterator<Masina>iterator=masinas.iterator();
        while (iterator.hasNext()){
            Masina masina=iterator.next();
            System.out.println(masina);
        }

    }
    public void ex4(){
        Set<Masina> masinas = new TreeSet<>(new ComparatorMasinaCuloare());

        Masina ford = new Masina(10, "ford", "ranger", 3761, "verde");
        Masina audi = new Masina(77, "audi", "q7", 87988, "alb");
        Masina ferrari = new Masina(872, "ferrari", "enzo", 2872, "rosu");
        Masina bmw = new Masina(2892, "bmw", "x5", 287, "negru");
        masinas.add(ford);
        masinas.add(audi);
        masinas.add(ferrari);
        masinas.add(bmw);
        System.out.println(masinas.contains(ford));
    }
    public void ex5(){
        Set<Masina> masinas = new TreeSet<>(new ComparatorMasinaCuloare());

        Masina ford = new Masina(10, "ford", "ranger", 3761, "verde");
        Masina audi = new Masina(77, "audi", "q7", 87988, "alb");
        Masina ferrari = new Masina(872, "ferrari", "enzo", 2872, "rosu");
        Masina bmw = new Masina(2892, "bmw", "x5", 287, "negru");
        masinas.add(ford);
        masinas.add(audi);
        masinas.add(ferrari);
        masinas.add(bmw);

        ((TreeSet<Masina>)masinas).descendingSet().stream().forEach(System.out::println);
    }
    public void ex6(){
        Set<Masina> masinas = new TreeSet<>(new ComparatorMasinaCuloare());

        Masina ford = new Masina(10, "ford", "ranger", 3761, "verde");
        Masina audi = new Masina(77, "audi", "q7", 87988, "alb");
        Masina ferrari = new Masina(872, "ferrari", "enzo", 2872, "rosu");
        Masina bmw = new Masina(2892, "bmw", "x5", 287, "negru");
        masinas.add(ford);
        masinas.add(audi);
        masinas.add(ferrari);
        masinas.add(bmw);

        System.out.println( ((TreeSet<Masina>)masinas).first());

    }

    public void ex7(){
        Set<Masina> masinas = new TreeSet<>(new ComparatorMasinaCuloare());

        Masina ford = new Masina(10, "ford", "ranger", 3761, "verde");
        Masina audi = new Masina(77, "audi", "q7", 87988, "alb");
        Masina ferrari = new Masina(872, "ferrari", "enzo", 2872, "rosu");
        Masina bmw = new Masina(2892, "bmw", "x5", 287, "negru");
        masinas.add(ford);
        masinas.add(audi);
        masinas.add(ferrari);
        masinas.add(bmw);

        System.out.println( ((TreeSet<Masina>)masinas).floor(ferrari));

    }



}
