package com.learn.iterator.white;

/**
 * Created by Administrator on 2017/8/6.
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;

    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    public int size(){
        return objArray.length;
    }

    public Object getElement(int index){
        if(index < objArray.length){
            return objArray[index];
        }
        return null;
    }
}
