package com.company;

public class Main {

    public static void main(String[] args) {
        MühDönemÖğrencileri Donem2018 = new MühDönemÖğrencileri();


        Ogrenci ogrenci1= new Ogrenci(2018);
        Ogrenci ogrenci2= new Ogrenci(2018);

        Donem2018.KayıtAl(ogrenci1);
        Donem2018.KayıtAl(ogrenci2);

        MühDönemÖğrencileri Donem2019 = new MühDönemÖğrencileri();

        Ogrenci ogrenci3= new Ogrenci(2019);
        Ogrenci ogrenci4= new Ogrenci(2019);

        Donem2019.KayıtAl(ogrenci3);
        Donem2019.KayıtAl(ogrenci4);

        MühDönemÖğrencileriKorona KoronaDonemi = new MühDönemÖğrencileriKorona(Donem2019);

        ogrenci1.setAkts(210);
        ogrenci1.setStajgünü(35);

        ogrenci3.setAkts(210);
        ogrenci3.setStajgünü(35);


        System.out.println("\n"+ogrenci1.toString());
        Donem2018.MezunEt(ogrenci1);

        System.out.println("\n"+ogrenci3.toString());
        KoronaDonemi.KoronaMezunEt(ogrenci3);





    }
}
