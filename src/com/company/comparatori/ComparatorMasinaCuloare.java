package com.company.comparatori;

import com.company.model.Masina;

import java.util.Comparator;

public class ComparatorMasinaCuloare implements Comparator<Masina> {
    @Override
    public int compare(Masina o1, Masina o2) {
        if(o1.getCuloare().compareTo(o2.getCuloare())>0){

            return  1;
        }else if(o1.getCuloare().equals(o2.getCuloare())){
            return 0;
        }else
            return -1;

    }



}
