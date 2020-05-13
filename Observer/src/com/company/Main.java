package com.company;

public class Main {

    public static void main(String[] args) {

        DiziSitesi diziSitesi = new DiziSitesi();


        for (int i = 0; i < 5; i++) {
            new SilverÜye(diziSitesi);
            new GoldÜye(diziSitesi);
            new PlatÜye(diziSitesi);
        }


        diziSitesi.setMesaj("TheBlackList");

    }
}
