package com.learn.visitor.shuangfenpai;

/**
 * Created by Administrator on 2017/7/24.
 */
public class Test {

    public static void main(String[] args){
        Father father = new Father();
        Son1 son1 = new Son1();
        Son2 son2 = new Son2();
        Execute exe = new Execute();
        father.accept(exe);
        son1.accept(exe);
        son2.accept(exe);
    }
}
