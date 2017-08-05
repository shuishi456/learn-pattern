package com.learn.template;

/**
 * Created by Administrator on 2017/8/6.
 */
public class Client {

    public static void main(String[] args){
        AbstractTemplate template = new ConcreteTemplate();
        template.myLife();
    }


}
