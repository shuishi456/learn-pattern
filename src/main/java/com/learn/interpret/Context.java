package com.learn.interpret;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/8.
 */
public class Context {

    private Map<Expression,Integer> map = new HashMap();

    public void addValue(Variable v,int y){
        Integer yi = new Integer(y);
        map.put(v,yi);
    }

    public int lookupValue(Variable v){
        int i = map.get(v).intValue();
        return i;
    }

}
