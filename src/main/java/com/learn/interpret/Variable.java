package com.learn.interpret;

/**
 * Created by Administrator on 2017/8/8.
 */
public class Variable extends Expression {

    @Override
    public int interpret(Context ctx) {
        return ctx.lookupValue(this);
    }
}
