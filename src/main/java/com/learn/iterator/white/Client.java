package com.learn.iterator.white;

/**
 * Created by Administrator on 2017/8/6.
 */
public class Client {

    public void operation(){
       Object[] objs = {"1","2","3"};
        Aggregate agg = new ConcreteAggregate(objs);
        Iterator iter = agg.createIterator();
        while(!iter.isDone()){
            System.out.println(iter.currentElement());
            iter.next();
        }

    }

    
    public static void main(String[] args){
        Client client = new Client();
        client.operation();
    }
    
}
