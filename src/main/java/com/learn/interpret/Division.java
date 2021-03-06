package com.learn.interpret;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Division extends Expression {

    private Expression left, right;

    public Division(Expression left, Expression right)

    {

        this.left = left;

        this.right = right;

    }

    public int interpret(Context con)

    {

        try {

            return left.interpret(con) / right.interpret(con);

        } catch (ArithmeticException ae)

        {

            System.out.println("被除数为0！");

            return -11111;

        }
    }
}
