package com.learn.iterator.black;

import com.learn.iterator.white.Aggregate;
import com.learn.iterator.white.ConcreteAggregate;
import com.learn.iterator.white.Iterator;

/**
 * Created by Administrator on 2017/8/6.
 */
public class Client {

    public void operation(){
        Object[] objArray = {"1","2","3"};
        Aggregate agg = new BlackConcreteAggregate(objArray);
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentElement());
            it.next();
        }
    }

    public static void main(String[] args){
        Client client = new Client();
        client.operation();
    }

}
