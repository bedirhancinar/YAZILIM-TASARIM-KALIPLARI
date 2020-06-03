package command;

public class HisseSenedi {

    private String name = "THY";
    private int quantity = 0;

    public void buy(){
        quantity++;
        System.out.println("Hisse Senedi Alındı [ İsmi: "+name+",  Miktar: " + quantity +" ] ");
    }
    public void sell(){
        quantity--;
        System.out.println("Hisse Senedi Satıldı [ İsmi: "+name+",  Miktar: " + quantity +" ] ");
    }
}
