package com.company;

public class GoldÜye extends Üye {


    public GoldÜye(DiziSitesi diziSitesi){
        this.diziSitesi=diziSitesi;
        this.diziSitesi.ekleKişi(this);
    }

    @Override
    public void bildirim() {
        System.out.println("Gold üye olduğunuz için diziniz "+ diziSitesi.getMesaj() +" bu akşam 1 saat erken izlemeye başlayabilirsiniz.");
    }
}
