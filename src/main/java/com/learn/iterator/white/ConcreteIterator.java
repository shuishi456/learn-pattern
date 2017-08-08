package com.learn.iterator.white;

/**
 * Created by Administrator on 2017/8/6.
 */
public class ConcreteIterator implements Iterator {
    // 持有对迭代的具体聚合对象
    private ConcreteAggregate agg;
    // 记录当前迭代到的索引位置
    private int index;
    // 记录当前聚集对象的大小
    private int size;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        index = 0;
        size = aggregate.size();
        agg = aggregate;
    }

    public void first() {
        index = 0;
    }

    public void next() {
        if(index < size){
            index++;
        }
    }

    public Object currentElement() {
        return agg.getElement(index);
    }

    public boolean isDone() {
        return index >= size;
    }
}
