package com.inyomanw.oop;

public class Ikan extends Hewan {
    private String habitat;

    public Ikan(){};

    public Ikan(String habitat){
        this.setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String tampil() {
        return "Ikan Tidak Memiliki Kaki " ;
    }

}
