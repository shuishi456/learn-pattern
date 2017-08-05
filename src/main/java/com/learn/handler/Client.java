package com.learn.handler;

/**
 * Created by Administrator on 2017/8/4.
 */
public class Client {

    public static void main(String[] args){

        System.out.println(Client.class.getCanonicalName());
        System.out.println(Client.class.getName());
        System.out.println(Client.class.getSimpleName());

        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setNextHandler(handler2);
        handler1.process();
    }
}
