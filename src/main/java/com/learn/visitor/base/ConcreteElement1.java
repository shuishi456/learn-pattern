package com.learn.visitor.base;

/**
 * 具体元素1，采用
 *
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
