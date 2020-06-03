package com.company;

public class Ogrenci {
    private int akts = 0;
    private int stajgünü = 0;
    private int yıl;

    public Ogrenci(int yıl){
        this.yıl = yıl;
    }

    public int getAkts() {
        return akts;
    }

    public void setAkts(int akts) {
        this.akts = akts;
    }

    public int getStajgünü() {
        return stajgünü;
    }

    public void setStajgünü(int stajgünü) {
        this.stajgünü = stajgünü;
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "akts=" + akts +
                ", stajgünü=" + stajgünü +
                ", yıl=" + yıl +
                '}';
    }
}
