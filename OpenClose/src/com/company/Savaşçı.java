package com.company;

public class Savaşçı implements Karakterler {

    private int str;
    private int mag;

    public Savaşçı(int str, int mag) {
        this.mag = mag;
        this.str = str;
    }



    @Override
    public float hasarHesapla() {

        return   ( mag) + (float) (1.5 * str);
    }

    @Override
    public float zırhHesapla() {

        return   ( mag) + (float) (0.5 * str);
    }
}