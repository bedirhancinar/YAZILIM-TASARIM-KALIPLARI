package com.company;

public class Main {

    public static void main(String[] args) {

        ArrayContainer arrayContainer= new ArrayContainer();
        ListContainer listContainer= new ListContainer();

        new Thread(new Runnable() {
            public void run()
            {
                for (int i= 1; i<11; i++ ){
                StringBuilder  strBuilder=new StringBuilder ("Kişi ");
                strBuilder.append(i);
                listContainer.müşteriler.add(strBuilder);
            }
            }}).start();

        new Thread(new Runnable() {
            public void run()
            {
                int index = 4;
                for (int i= 75; i<105; i=i+5 ){
                    arrayContainer.notlar[index++]=i;
                }
            }}).start();

        new Thread(new Runnable() {
            public void run()
            {
                int index = 0;
                for (int i= 70; i<=85; i=i+5 ){
                    arrayContainer.notlar[index++]=i;
                }

            }}).start();


        for (Iterator iter = listContainer.getIterator(); iter.hasNext();) {
            System.out.println(iter.nextObject());
        }

        for (Iterator iter = arrayContainer.getIterator(); iter.hasNext();) {
            System.out.println(iter.nextObject().toString());
        }

    }
}
