package com.learn.state;

/**
 * Created by Administrator on 2017/7/28.
 */
public class ConcreteStateA implements State {
    public void handle(Context context) {
        System.out.println("i do something a");
        context.setState(new ConcreteStateB());

    }
}
