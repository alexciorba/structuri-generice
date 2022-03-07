package com.company;

import java.util.Comparator;

public class ComparatorMasinaMarca implements Comparator<Masina> {
    @Override
    public int compare(Masina o1, Masina o2) {

        if(o1.getMarca().compareTo(o2.getMarca())>0){

            return  1;
        }else if(o1.getMarca().equals(o2.getMarca())){
            return 0;
        }else
            return -1;


    }
}
