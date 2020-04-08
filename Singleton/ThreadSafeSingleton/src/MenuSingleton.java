public class MenuSingleton {

    private static MenuSingleton ornekMenuSingleton =null;  //volatile bu değişkenin, program dışında bir etki altında bulunabileceğini ifade eder.
    // Java ve C# için volatile değişken sadece tek bir kopya tutar.




    private MenuSingleton() {

    }





    public static MenuSingleton getOrnekMenuSingleton() {  // nesne çağırmak için erişilebilecek tek public method.

        if (ornekMenuSingleton == null) {         //  MenüSingleton tipindeki result değişkeninin daha önce oluşturulup oluşturulmadığı kontrol edilir.

            ornekMenuSingleton = new MenuSingleton(); // oluşturmadıysa oluşturur oluşturuysa buraa girmeden direk önden oluşturululanı döndürür.
        }
        return ornekMenuSingleton;

    }
}



