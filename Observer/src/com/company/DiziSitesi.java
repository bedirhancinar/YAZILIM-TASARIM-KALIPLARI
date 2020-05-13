package com.company;

import java.util.ArrayList;
import java.util.List;

public class DiziSitesi {
    private String mesaj;
    private List<Üye> üyeList = new ArrayList<>();

    public void ekleKişi(Üye üye){
        üyeList.add(üye);
    }

    public void çıkarKişi(Üye üye){
        üyeList.remove(üye);
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
        herkeseBildirimGönder();
    }

    public String getMesaj() {
        return mesaj;
    }

    public void herkeseBildirimGönder(){

         int sayı=üyeList.size();

        new Thread(new Runnable() {
            public void run()
            {
                for (int i= 0; i<sayı/2; i++ ){
                    üyeList.get(i).bildirim();
                }
            }}).start();

        new Thread(new Runnable() {
            public void run()
            {
                for (int i= sayı/2 ; i<sayı; i++ ){
                    üyeList.get(i).bildirim();
                }
            }}).start();

    }
}
