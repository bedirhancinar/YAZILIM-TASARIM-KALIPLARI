package com.company;

public class SoruFabrikası {

    public Soru SoruUret(int sorutipi){

        if (sorutipi == 1)
            new Matematik().soruOlustur();
        else if (sorutipi == 2)
            new Fizik().soruOlustur();
        else if (sorutipi == 3)
            new Kimya().soruOlustur();
        else if (sorutipi == 4)
            new Biyoloji().soruOlustur();

        return null;
    }
}
