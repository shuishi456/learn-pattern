package com.learn.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/8/7.
 */
public class Arraylist {

    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        Iterator<String> iter = arrayList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }


}
