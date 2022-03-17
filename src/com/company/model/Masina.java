package com.company.model;

public class Masina implements Comparable<Masina> {

    private int id;
    private String marca;
    private String model;
    private int km;
    private String culoare;

    public Masina(int id, String marca, String model, int km, String culoare) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.km = km;
        this.culoare = culoare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public boolean equals(Object o){
        Masina masina=(Masina) o;
        return masina.getId()==this.id && masina.getMarca().equals(this.marca) && masina.getModel().equals(this.model) && masina.getKm()==this.km && masina.getCuloare().equals(this.culoare);
    }

    public String toString(){
        String text=id +"," + marca +  "," + model + "," + km + "," + culoare;
        return text;
    }

    public int compareTo(Masina m){
        if(this.km > m.km){
            return 1;
        }else if (this.km==m.km){
            return 0;
        }else{
            return -1;
        }
    }
}
