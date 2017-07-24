package com.learn.visitor.base;

/**
 * Created by Administrator on 2017/7/18.
 */
public interface IVisitor {

    void visit(ConcreteElement1 el1);

    void visit(ConcreteElement2 el2);

}
