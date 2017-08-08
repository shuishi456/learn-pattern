package com.learn.interpret;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Add extends Expression {

    private Expression left,right;

    public Add(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }

    public int interpret(Context ctx) {
        return left.interpret(ctx)  + right.interpret(ctx);
    }
}
