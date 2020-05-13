package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListContainer implements Container {

    public List<StringBuilder> müşteriler = new ArrayList<>();



    @Override
    public Iterator getIterator() {
        return new Iterator();
    }



    private class Iterator implements com.company.Iterator {

        private int index=0;

        @Override
        public boolean hasNext() {
            if (index< müşteriler.size()){
                return true;
            }else{
                return false;
            }

        }

        @Override
        public Object nextObject() {
            if (this.hasNext()){
                return müşteriler.get(index++);
            }else{
                return null;
            }

        }
    }





}
