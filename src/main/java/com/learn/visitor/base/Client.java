package com.learn.visitor.base;

import java.util.List;

/**
 *
 * 访问者模式
 *
 * Created by Administrator on 2017/7/19.
 */
public class Client {

    public static void main(String[] args){
        List<Element> list = ObjectStruture.getList();
        for (Element e : list){
            e.accept(new Visitor());
        }
    }

}
