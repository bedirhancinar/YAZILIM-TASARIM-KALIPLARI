package com.company;

public class MühDönemÖğrencileriKorona extends KoronaÖzel {

    public MühDönemÖğrencileriKorona(Ogrenciİşleri ogrenciİşleri) {
        super(ogrenciİşleri);

    }

    public void KoronaMezunEt(Ogrenci ogrenci){
        if (ogrenci.getAkts() >= 200  && ogrenci.getStajgünü() >= 30){
            System.out.println("Korona sebebiyle akts şartı 200 e zorunlu staj 30 güne indirilmiştir artık mezun olabilirsiniz....");
        }else{
            System.out.println("Üzgünüz korona mezuniyet şartlarını taşımıyorsunuz.");
        }
    }


}
