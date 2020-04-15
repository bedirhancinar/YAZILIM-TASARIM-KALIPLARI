package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Şube anaŞube = new Şube();
        System.out.println("\n");


        anaŞube.yemekEkle("Yemek 1" , 20.0);

        anaŞube.yemekEkle("Tatlı 1" , 11.90);

        anaŞube.setName("Ana Şube      ");



        Şube KocaeliŞubesi = (Şube) anaŞube.shadowCopy();
        KocaeliŞubesi.setName("Kocaeli Şubesi");

        KocaeliŞubesi.yemekEkle("Yemek 2" , 15.5);
        KocaeliŞubesi.yemekEkle("Tatlı 2" , 15.5);


        Şube AnkaraŞubesi = (Şube) anaŞube.shadowCopy();
        AnkaraŞubesi.setName("Ankara  Şubesi");
        AnkaraŞubesi.yemekEkle("İçecek 1" , 3.5);

        System.out.println(anaŞube.getName() +" :  "+ anaŞube.getName().hashCode() +"  Yemek Listesi :  "+ anaŞube.getYemekListesi() + "   HashCode:  " + anaŞube.getYemekListesi().hashCode()+"\n");
        System.out.println(KocaeliŞubesi.getName() +" :  "+ KocaeliŞubesi.getName().hashCode() +"  Yemek Listesi :  "+ KocaeliŞubesi.getYemekListesi() + "   HashCode:  " + KocaeliŞubesi.getYemekListesi().hashCode()+"\n");

        System.out.println(AnkaraŞubesi.getName() +" :  "+ AnkaraŞubesi.getName().hashCode() +"  Yemek Listesi :  "+ AnkaraŞubesi.getYemekListesi() + "   HashCode:  " + AnkaraŞubesi.getYemekListesi().hashCode()+"\n");

        System.out.println("\n\n\n");


        Şube İstanbulŞubesi = (Şube) anaŞube.clone();
        İstanbulŞubesi.setName("İstanbul  Şubesi");
        İstanbulŞubesi.setKar(0.0);
        İstanbulŞubesi.yemekEkle("Balık",55.5);

        System.out.println(İstanbulŞubesi.getName() +" :  "+ İstanbulŞubesi.getName().hashCode() +"  Yemek Listesi :  "+ İstanbulŞubesi.getYemekListesi() + "   HashCode:  " + İstanbulŞubesi.getYemekListesi().hashCode()+"\n");


        Şube AdanaŞubesi = (Şube) anaŞube.clone();
        AdanaŞubesi.setName("Adana  Şubesi   ");
        AdanaŞubesi.yemekEkle("Adana",14.00);
        AdanaŞubesi.yemekEkle("Şalgam",3.00);

        System.out.println(AdanaŞubesi.getName() +" :  "+ AdanaŞubesi.getName().hashCode() +"  Yemek Listesi :  "+ AdanaŞubesi.getYemekListesi() + "   HashCode:  " + AdanaŞubesi.getYemekListesi().hashCode()+"\n");





    }
}
