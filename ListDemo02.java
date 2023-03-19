package com.collectionframe.march19th;

import java.util.LinkedList;

public class ListDemo02 {
    public static void main(String[] args) {
        /**
         * LinkList 可以完成队列结构和栈结构（双链表）
         */
        LinkedList<String> stack=new LinkedList<>();
        // 压栈  LinkList独有的方法
        stack.addFirst("第1颗子弹");// 就是push()
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        System.out.println(stack);
        // 出栈
        System.out.println(stack.removeFirst());//就是pop()
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        /**
         * 队列
         */
        LinkedList<String> queue=new LinkedList<>();
        // 入队
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
        //出队
//        System.out.println(queue.removeLast());// 出最后一个元素
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
