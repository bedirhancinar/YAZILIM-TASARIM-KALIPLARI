public class ThreadSafeSingleton extends Thread {


    @Override
    public void run() {
        System.out.println("Thread başladı");
        Menu []menülist=new Menu[10];
        for(int i=0;i<10;i++){
            System.out.println("yeni bir nesne oluşturuyoruz  : "+i  +" .nesne  "+ menülist[i].getOrnekMenu());

            if (i==9){
                System.out.println("Thread bitti.");
            }
        }


    }

    public static void main(String[] args) {

        System.out.println("\n\n\nnormal şartlarda nesne oluşturduğumuzdaadreslerinin nasıl değiştiğini üç adet nesne oluşturup adreslerini ekrana basarak görelim:\n\n\n ");

        nesne n1=new nesne();
        nesne n2=new nesne();
        nesne n3=new nesne();

        System.out.println("nesne  n1 in adresi  :"+n1);
        System.out.println("nesne  n2 in adresi  :"+n2);
        System.out.println("nesne  n3 in adresi :"+n3);

        MenuSingleton menuSingleton1=MenuSingleton.getOrnekMenuSingleton();
        MenuSingleton menuSingleton2=MenuSingleton.getOrnekMenuSingleton();
        MenuSingleton menuSingleton3=MenuSingleton.getOrnekMenuSingleton();


        System.out.println("\n\n\n İlk üretilen menuSingleton1 nesnesinin adresi: "+ menuSingleton1);
        System.out.println("İkinci üretilen menuSingleton2 nesnesinin adresi: "+ menuSingleton2);
        System.out.println("Son üretilen menuSingleton3 nesnesinin adresi: " +menuSingleton3);



        System.out.println("\n\n\n   Thread Safe Singleton tipinde nesnemizi çağırıyoruz : "+ Menu.getOrnekMenu());

        System.out.println("\nAynı nesnenin refere edildiğini göstermek için 3 nesne daha oluşturup ekrana basıyoruz.");

        Menu menu1=Menu.getOrnekMenu();
        Menu menu2=Menu.getOrnekMenu();
        Menu menu3=Menu.getOrnekMenu();


        System.out.println("\nİlk üretilen menu1 nesnesinin adresi: "+ menu1);
        System.out.println("İkinci üretilen menu2 nesnesinin adresi: "+ menu2);
        System.out.println("Son üretilen menu3 nesnesinin adresi: " +menu3);


        System.out.println("\n\n\n\n\n  Thread safe kontrolü için  :  \n\n");


        ThreadSafeSingleton tread =new ThreadSafeSingleton();
        ThreadSafeSingleton tread2 =new ThreadSafeSingleton();
        ThreadSafeSingleton tread3 =new ThreadSafeSingleton();
        tread.start();
        tread2.start();
        tread3.start();


    }


}
