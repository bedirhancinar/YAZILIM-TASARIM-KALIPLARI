package com.company;

public class Büyücü implements Karakterler {
    private int str;
    private int mag;

    public Büyücü(int str, int mag) {
        this.mag = mag;
        this.str = str;
    }

    @Override
    public float hasarHesapla() {
        return (float) (1.7 * mag) +   (float) ( 0.9 * str);
    }

    @Override
    public float zırhHesapla() {
        return (float) (0.3 * mag) +   (float) ( 1.1 * str);    }
}
