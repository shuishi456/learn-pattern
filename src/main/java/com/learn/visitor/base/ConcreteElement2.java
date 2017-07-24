package com.learn.visitor.base;

/**
 * Created by Administrator on 2017/7/19.
 */
public class ConcreteElement2 extends  Element {

    public void accept(IVisitor vistor) {
        vistor.visit(this);
    }

    public void doSomething() {
        System.out.println("this is element 2");
    }
}
