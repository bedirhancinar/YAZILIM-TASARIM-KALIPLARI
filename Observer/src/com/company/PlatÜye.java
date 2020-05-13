package com.company;

public class PlatÜye extends Üye {


    public PlatÜye(DiziSitesi diziSitesi){
        this.diziSitesi=diziSitesi;
        this.diziSitesi.ekleKişi(this);
    }

    @Override
    public void bildirim() {
        System.out.println("Platinium üyelere özel diziniz "+ diziSitesi.getMesaj() +" 5 saat önce sisteminize eklenecektir.");
    }
}
