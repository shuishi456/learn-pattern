package com.learn.vistor.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2017/7/19.
 */
public class ObjectStruture {
    public static List<Element> getList(){
        List<Element> list = new ArrayList<Element>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            int a = random.nextInt(100);
            if(a>50){
                list.add(new ConcreteElement1());
            } else {
                list.add(new ConcreteElement2());
            }
        }
        return list;
    }
}
