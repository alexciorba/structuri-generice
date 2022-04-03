package com.company.comparatori;

import com.company.model.Persoana;

import java.util.Comparator;

public class ComparatorPersoanaNume implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1,Persoana p2){
        if(p1.getNume().compareTo(p2.getNume())>0){
            return 1;
        }else if(p1.getNume().equals(p2.getNume())){
            return 0;
        }else return -1;
    }
}
