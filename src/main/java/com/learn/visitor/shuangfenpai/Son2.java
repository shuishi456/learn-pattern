package com.learn.visitor.shuangfenpai;

/**
 *  通过覆写实现动态绑定，
 *
 * Created by Administrator on 2017/7/24.
 */
public class Son2 extends Father {

    @Override
    public void accept(Execute exe) {
        exe.method(this);
    }
}
