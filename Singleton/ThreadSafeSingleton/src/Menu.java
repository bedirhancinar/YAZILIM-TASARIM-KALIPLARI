import java.util.HashMap;

public class Menu {

    private static volatile Menu ornekMenu;  //volatile bu değişkenin, program dışında bir etki altında bulunabileceğini ifade eder.
                                                // Java ve C# için volatile değişken sadece tek bir kopya tutar.
    private static Object lock = new Object();

    private HashMap<String,Integer> yemekListesi =new  HashMap<String,Integer>();
    private HashMap<String,Integer> tatliListesi =new  HashMap<String,Integer>();
    private HashMap<String,Integer> icecekListesi =new  HashMap<String,Integer>();


    private  Menu() {

    }


    public HashMap<String, Integer> getYemekListesi() {
        return yemekListesi;
    }

    private void setYemekListesi(HashMap<String, Integer> yemekListesi) {
        this.yemekListesi = yemekListesi;
    }

    public HashMap<String, Integer> getTatliListesi() {
        return tatliListesi;
    }

    private void setTatliListesi(HashMap<String, Integer> tatliListesi) {
        this.tatliListesi = tatliListesi;
    }

    public HashMap<String, Integer> getIcecekListesi() {
        return icecekListesi;
    }

    private void setIcecekListesi(HashMap<String, Integer> icecekListesi) {
        this.icecekListesi = icecekListesi;
    }


    public static Menu getOrnekMenu() {  // nesne çağırmak için erişilebilecek tek public method.
        Menu result = ornekMenu;  //volatile değişkene erişimi teke indiriyoruz
        if (result == null) {         // Üst tarafta döndürülecek Menu tipindeki result değişkeninin daha önce oluşturulup oluşturulmadığı kontrol edilir.
            synchronized (lock) {    // Thread safe sağlanması için
                result = ornekMenu;
                if (result == null)
                    ornekMenu = result = new Menu();
            }
        }
        return result;
    }
}


