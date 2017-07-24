package com.learn.visitor.shuangfenpai;

/**
 *
 *
 * Created by Administrator on 2017/7/24.
 */
public class Father {

    public void accept(Execute exe){
        exe.method(this);
    }

}
