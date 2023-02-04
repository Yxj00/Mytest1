package com.duixiang.day19;

import java.util.List;

public class YxjIterator {
    private List list;

    public YxjIterator(List list) {
        this.list = list;
    }

    /**
     * ������ ������ count=0
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
           //˵�������� �޷�������ȡԪ�� �����±��ǲ���Խ����
           throw new YxjException("�޷��������»�ȡԪ��");
       }
       return list.get(count++);
    }
    boolean hasNext(){
       //�жϼ������Ƿ���Լ�����ȡԪ�� ��true ��false
//        if (count== list.size()){
//            return false;
//        }
//        return true;
        return count!= list.size();
    }
}
