package com.inyomanw.oop;

public class Hewan {
    private int kaki;
    private String alatNafas;

    public Hewan(){

    }
    public Hewan(int kaki, String alatNafas){
        this.setKaki(kaki);
        this.setAlatNafas(alatNafas);
    }

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }

    public String getAlatNafas() {
        return alatNafas;
    }

    public void setAlatNafas(String alatNafas) {
        this.alatNafas = alatNafas;
    }

    public String tampil() {
        return "Nama : " + kaki + "\n"
                + "Umur : " + alatNafas + "\n";
    }
}
