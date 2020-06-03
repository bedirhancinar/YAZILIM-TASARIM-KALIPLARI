package com.company;

public class MühDönemÖğrencileri implements Ogrenciİşleri {


    @Override
    public void KayıtAl(Ogrenci ogrenci) {
       ogrenciList.add(ogrenci);
    }

    @Override
    public void MezunEt(Ogrenci ogrenci) {
        if (ogrenci.getAkts() >= 240  && ogrenci.getStajgünü() >= 50){
            System.out.println("Tebrikler mezun olabilirsiniz....");
        }else{
            System.out.println("Üzgünüz mezuniyet şartlarını taşımıyorsunuz.");
        }
    }
}
