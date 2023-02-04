package com.duixiang.day19;

import java.util.List;

public class YxjIterator {
    private List list;

    public YxjIterator(List list) {
        this.list = list;
    }

    /**
     * 迭代器 计数器 count=0
     * @return
     */
    private int count=0;
   public Object next(){
       /**
        * 1.
        */
       if (list==null){
           throw new YxjException("list is null");
       }
       if (count>=list.size()){
           //说明集合中 无法继续获取元素 访问下标是不是越界了
           throw new YxjException("无法继续向下获取元素");
       }
       return list.get(count++);
    }
    boolean hasNext(){
       //判断集合中是否可以继续获取元素 是true 否false
//        if (count== list.size()){
//            return false;
//        }
//        return true;
        return count!= list.size();
    }
}
