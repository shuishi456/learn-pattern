package com.learn.interpret;

/**
 * Created by Administrator on 2017/8/8.
 */
public class Constant extends Expression {

    private int i;

    public Constant(int i){
        this.i = i;
    }

    @Override
    public int interpret(Context ctx) {
        return i;
    }
}
