package com.company;

public class SilverÜye extends Üye {


    public SilverÜye(DiziSitesi diziSitesi){
        this.diziSitesi=diziSitesi;
        this.diziSitesi.ekleKişi(this);
    }

    @Override
    public void bildirim() {
        System.out.println("Silver üye olduğunuz için diziniz "+ diziSitesi.getMesaj() +" bu akşam saatinde yayınlanacaktır.");
    }
}
