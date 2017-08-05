package com.learn.handler;

import com.learn.handler.Handler;

/**
 * 具体责任链处理
 * Created by Administrator on 2017/8/3.
 */
public class ConcreteHandler extends Handler {
    public void process() {
        System.out.println("开始处理");
        if(getNextHandler()!=null){
            getNextHandler().process();
        } else {
            System.out.println("结束了");
        }
    }
}
