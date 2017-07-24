package com.learn.visitor.base;

/**
 * Created by Administrator on 2017/7/19.
 */
public abstract class Element {
    public abstract void accept(IVisitor vistor);
    public abstract void doSomething();
}
