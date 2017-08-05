package com.learn.visitor.enumimplement;

/**
 * Created by Administrator on 2017/8/5.
 */
public enum Element {

    CREATE(1),UPDATE(2),DELETE(3),LIST(4);

    private int code;

     Element(int code){
        this.code = code;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

     static interface Visitor {

         void visit(Element e);


    }

}
