package com.learn.template;

/**
 * Created by Administrator on 2017/8/6.
 */
public abstract class AbstractTemplate {

    public abstract void eat();

    public abstract void sleep();

    protected final void myLife(){
        eat();
        sleep();
    }


}
