package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main extends Thread {

    @Override
    public void run() {


        Random rand = new Random();


        try {
            for (int i = 0; i < 3; i++) {
                Gişe gişem = Banka.BoşGişeBul();

                if (gişem != null){
                    System.out.println(gişem.name+ " kullanılmaya başlandı . " );
                    TimeUnit.SECONDS.sleep(rand.nextInt(5));  // 0-5 sn arası bekleme
                    System.out.println(gişem.name+ " işlem sonlandı . " );

                    Banka.Ayrıl(gişem);
                }else{
                    System.out.println("boş vezne bekleniyor ");
                    TimeUnit.SECONDS.sleep(rand.nextInt(10));  // 0-5 sn arası bekleme
                }




            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {


        Main müşteri1 = new Main();
        Main müşteri2 = new Main();
        Main müşteri3 = new Main();
        Main müşteri4 = new Main();
        Main müşteri5 = new Main();
        Main müşteri6 = new Main();
        Main müşteri7 = new Main();
        Main müşteri8 = new Main();
        Main müşteri9 = new Main();


        müşteri1.start();
        müşteri2.start();
        müşteri3.start();
        müşteri4.start();
        müşteri5.start();
        müşteri6.start();
        müşteri7.start();
        müşteri8.start();
        müşteri9.start();


    }
}
