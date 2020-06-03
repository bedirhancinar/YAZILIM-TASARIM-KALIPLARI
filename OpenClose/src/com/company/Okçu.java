package com.company;

public class Okçu implements Karakterler {

    private int str;
    private int mag;

    public Okçu(int str, int mag) {
        this.mag = mag;
        this.str = str;
    }



    @Override
    public float hasarHesapla() {

        return  (float) (1.2 * mag) + (float) (1.2 * str);
    }

    @Override
    public float zırhHesapla() {

        return  (float) (0.8 * mag) + (float) (0.8 * str);
    }
}
