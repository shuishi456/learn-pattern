package com.learn.visitor.enumimplement;

/**
 *
 * 待定，需要去核实
 *
 * Created by Administrator on 2017/8/5.
 */
public class Client {

    public static void main(String[] args){
        Element.LIST.accept(new Element.Visitor() {

            public void visit(Element e) {

            }
        });
    }

}
