package com.learn.iterator.white;

/**
 * Created by Administrator on 2017/8/6.
 */
public interface Iterator {

    void first();

    void next();

    boolean isDone();

    Object currentElement();
}
