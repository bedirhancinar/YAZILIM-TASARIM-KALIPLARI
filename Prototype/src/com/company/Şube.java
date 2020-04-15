package com.company;

import java.util.HashMap;

public class Şube implements Yemekhane {



    private String name = " Şube " ;
    private double kar = 0 ;
    private HashMap<String,Double> yemekListesi ;



    public void yemekEkle(String Ad , double Fiyat){
        if(yemekListesi==null){
            yemekListesi=new HashMap<>();
        }
        yemekListesi.put(Ad,Fiyat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKar() {
        return kar;
    }

    public void setKar(double kar) {
        this.kar = kar;
    }

    public HashMap<String, Double> getYemekListesi() {
        return yemekListesi;
    }

    public void setYemekListesi(HashMap<String, Double> yemekListesi) {
        this.yemekListesi = yemekListesi;
    }



//    @Override
//    public Yemekhane deepCopy() throws CloneNotSupportedException {
//        Şube tempŞube = new Şube();
//
//        tempŞube.setName(  this.getName()  );
//        tempŞube.setKar(   this.getKar()  );
//
//
//        HashMap<String,Double> tempYemekListesi = new HashMap<>();
//        tempYemekListesi = this.getYemekListesi();
//
//        tempŞube.setYemekListesi(  tempYemekListesi  );
//
//        return tempŞube;
//    }



    @Override
    public Yemekhane shadowCopy() throws CloneNotSupportedException {

        Şube tempŞube = new Şube();

        tempŞube.setName(  this.getName()  );
        tempŞube.setKar(   this.getKar()  );
        tempŞube.setYemekListesi(  this.getYemekListesi()  );

        return tempŞube;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        Şube tempŞube = new Şube();

        tempŞube.setName(  this.getName()  );
        tempŞube.setKar(   this.getKar()  );
        tempŞube.setYemekListesi(  (HashMap<String, Double>) yemekListesi.clone()  );

        return tempŞube;
    }
}
