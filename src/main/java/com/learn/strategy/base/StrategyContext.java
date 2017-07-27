package com.learn.strategy.base;

/**
 * Created by Administrator on 2017/7/27.
 */
public class StrategyContext {

    private Strategy strategy;

    public void useStrategy(){
        this.getStrategy().strategyInterface();
    }


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {

        return strategy;
    }

    public static void main(String[] args){
        StrategyContext context = new StrategyContext();
        Strategy strategy = new ConcreteStrategy();
        context.setStrategy(strategy);
        context.useStrategy();
    }

}
