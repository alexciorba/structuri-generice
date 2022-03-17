package com.company.model;

public class Persoana implements Comparable<Persoana>{
    private int id;
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(int id, String nume, String prenume, int varsta) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public boolean equals(Object o){
        Persoana persoana=(Persoana) o;
        return persoana.getId()==this.id && persoana.getNume().equals(this.nume) && persoana.getPrenume().equals(this.prenume) && persoana.getVarsta()==this.varsta;
    }

    public String toString(){
        String text=id+","+nume+","+prenume+","+varsta;
        return text;
    }
    public int compareTo(Persoana persoana){
        if(this.varsta>persoana.varsta){
            return 1;
        }else if(this.varsta==persoana.varsta){
            return 0;
        }else {
            return -1;
        }
    }
}
