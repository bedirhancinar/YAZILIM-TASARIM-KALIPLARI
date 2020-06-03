package com.company;

public abstract class KoronaÖzel implements Ogrenciİşleri {

    private Ogrenciİşleri ogrenciİşleri;

    public KoronaÖzel(Ogrenciİşleri ogrenciİşleri){
        this.ogrenciİşleri = ogrenciİşleri;
    }



    public void KayıtAl(Ogrenci ogrenci) {
        ogrenciList.add(ogrenci);
    }


    public void MezunEt(Ogrenci ogrenci) {
        if (ogrenci.getAkts() >= 240  && ogrenci.getStajgünü() >= 50){
            System.out.println("Tebrikler mezun olabilirsiniz....");
        }else{
            System.out.println("Üzgünüz mezuniyet şartlarını taşımıyorsunuz.");
        }
    }


}
