package com.learn.visitor.shuangfenpai;

/**
 * 静态绑定，通过参数来判断
 *
 * Created by Administrator on 2017/7/24.
 */
public class Execute {

    public  void method(Father father){
       System.out.println("this is father");
    }

    public void method(Son1 son1){
        System.out.println("this is son1");
    }

    public void method(Son2 son2){
        System.out.println("this is son2");
    }

}
