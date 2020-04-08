package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SoruFabrikası sorufabrikası=new SoruFabrikası();
        Random rand = new Random();
        Soru sorubankası[]=new Soru[10];

        for (int i=0;i<10;i++){
            sorubankası[i]  =  sorufabrikası.SoruUret(rand.nextInt(3)+1);
        }

    }
}
