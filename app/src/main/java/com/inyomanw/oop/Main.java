package com.inyomanw.oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printAtributKaki();
    }


    private static void printAtributKaki(){
        Kucing kucing =new Kucing();
        System.out.println(kucing.tampil());
        Ayam ayam = new Ayam();
        System.out.println(ayam.tampil());
        Ikan ikan = new Ikan();
        System.out.println(ikan.tampil());
    }
}
