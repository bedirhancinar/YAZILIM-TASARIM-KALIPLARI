package com.company;

public class Banka {

    private static volatile Banka banka;
    private static Object lock = new Object();
    private static Gişe[] Gişeler=new Gişe[3];;


    private Banka() {

        for (int i = 0; i < 3; i++) {
            Gişe temp= new Gişe("Vezne " + (i + 1));
            Gişeler[i]=temp;
        }
    }

    public static Gişe BoşGişeBul() {

        Banka result = banka;  //volatile değişkene erişimi teke indiriyoruz
        if (result == null) {         // Üst tarafta döndürülecek Menu tipindeki result değişkeninin daha önce oluşturulup oluşturulmadığı kontrol edilir.
            synchronized (lock) {    // Thread safe sağlanması için
                result = banka;
                if (result == null)
                    banka = new Banka();
            }
        }

        Gişe boşGişe = BosGişe(Gişeler);
        if (boşGişe != null) {

            boşGişe.müsait = false;

            return boşGişe;


        }


        return null;

    }


    public static void Ayrıl(Gişe tempGişe){
        tempGişe.müsait=true;
    }

    private static Gişe BosGişe(Gişe[] gişeler) {
        Gişe result = null;
        for (int i = 0; i < gişeler.length; i++) {
            if (gişeler[i].müsait) {
                result = gişeler[i];
                return  result;
            }
        }

        return result;
    }
}

