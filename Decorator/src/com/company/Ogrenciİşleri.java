package com.company;

import java.util.ArrayList;
import java.util.List;

public interface Ogrenciİşleri {

    public List<Ogrenci> ogrenciList = new ArrayList<>();

    public  void KayıtAl(Ogrenci ogrenci);

    public  void MezunEt(Ogrenci ogrenci);

}
