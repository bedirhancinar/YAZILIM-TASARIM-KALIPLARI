package com.company;

import java.util.Arrays;

public class ArrayContainer implements Container {

    public int notlar[] = new int[10];


    @Override
    public Iterator getIterator() {
        return new Iterator();
    }


    private class Iterator implements com.company.Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < notlar.length) {
                return true;
            } else {
                return false;
            }

        }

        @Override
        public Object nextObject() {

            if (this.hasNext()){
                return notlar[index++];
            }else{
                return null;
            }
        }
    }


}
