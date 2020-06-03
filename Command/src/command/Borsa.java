package command;

public class Borsa {


    public static void main(String[] args) {

        HisseSenedi hisseSenedi = new HisseSenedi();

        HisseSenediAl hisseSenediAl = new HisseSenediAl(hisseSenedi);
        HisseSenediSat hisseSenediSat = new HisseSenediSat(hisseSenedi);

        Borsaİstanbul borsaİstanbul = new Borsaİstanbul();
        borsaİstanbul.takeOrder(hisseSenediAl);
        borsaİstanbul.takeOrder(hisseSenediAl);
        borsaİstanbul.takeOrder(hisseSenediAl);
        borsaİstanbul.takeOrder(hisseSenediSat);

        System.out.println("Birinci gün işlemleri...");
        borsaİstanbul.borsaBaşlat();

        System.out.println("İkinci Gün işlemleri...");


        borsaİstanbul.takeOrder(hisseSenediAl);
        borsaİstanbul.takeOrder(hisseSenediSat);
        borsaİstanbul.takeOrder(hisseSenediSat);
        borsaİstanbul.borsaBaşlat();
    }

}
