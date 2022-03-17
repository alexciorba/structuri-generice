package com.company.model;

public class Animal implements Comparable<Animal>{
    private int id;
    private String tip;
    private String rasa;
    private String nume;
    private int varsta;

    public Animal(int id, String tip, String rasa, String nume, int varsta) {
        this.id = id;
        this.tip = tip;
        this.rasa = rasa;
        this.nume = nume;
        this.varsta = varsta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }


    public boolean equals(Object o){
        Animal animal=(Animal) o;
        return animal.getId()==this.id && animal.getNume().equals(this.nume) && animal.getRasa().equals(this.rasa) && animal.getTip().equals(this.tip) && animal.getVarsta()==this.varsta;

    }
    public String toString(){
        String text=id+","+tip+","+rasa+","+nume+","+varsta;
        return text;
    }

    public int compareTo(Animal animal){
        if(this.varsta> animal.varsta){
            return 1;
        }else if(this.varsta== animal.varsta){
            return 0;
        }else{
            return -1;
        }
    }
}
