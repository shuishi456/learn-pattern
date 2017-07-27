package com.learn.state;

/**
 * Created by Administrator on 2017/7/28.
 */
public class Context {

    private State state;



    public void request(){
        this.getState().handle(this);
    }
    
    
    public static void main(String[] args){
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.request();
        context.request();
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
