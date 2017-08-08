package com.learn.iterator.black;

import com.learn.iterator.white.Aggregate;
import com.learn.iterator.white.Iterator;

/**
 * Created by Administrator on 2017/8/6.
 */
public class BlackConcreteAggregate extends Aggregate {

    private Object[] objArray;

    public BlackConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator{
        private int index;
        private int size;

        public ConcreteIterator() {
           this.index = 0;
            this.size = objArray.length;
        }

        public void first() {
            index =0;
        }

        public void next() {
            if(index < size){
                index++;
            }
        }

        public boolean isDone() {
            return index >= size;
        }

        public Object currentElement() {
           return objArray[index];
        }
    }
}
