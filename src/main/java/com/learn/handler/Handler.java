package com.learn.handler;

/**
 * 责任链模式
 *
 * Created by Administrator on 2017/8/3.
 */
public abstract class Handler {

    private Handler nextHandler;

    public abstract void process();


    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
