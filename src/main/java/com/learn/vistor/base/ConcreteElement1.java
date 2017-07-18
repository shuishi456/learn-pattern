package com.learn.vistor.base;

/**
 * Created by Administrator on 2017/7/19.
 */
public class ConcreteElement1 extends Element {

    public void accept(IVisitor vistor) {
        vistor.visit(this);
    }

    public void doSomething() {
        System.out.println("this is element 1");
    }
}
