package com.company;

public class Demo {

    public static void main(String[] args) {

        Karakterler oyuncu1 = new Büyücü( 50 , 50);

        Karakterler oyuncu2 = new Okçu( 50 , 50);

        Karakterler oyuncu3 = new Savaşçı( 50 , 50);


        System.out.println(" 1. oyuncunun hasarı: " + oyuncu1.hasarHesapla() + "  zırhı:  " + oyuncu1.zırhHesapla());

        System.out.println(" 2. oyuncunun hasarı: " + oyuncu2.hasarHesapla() + "  zırhı:  " + oyuncu2.zırhHesapla());

        System.out.println(" 3. oyuncunun hasarı: " + oyuncu3.hasarHesapla() + "  zırhı:  " + oyuncu3.zırhHesapla());

    }
}
