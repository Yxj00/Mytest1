package com.collectionframe.march19th;

import java.util.LinkedList;

public class ListDemo02 {
    public static void main(String[] args) {
        /**
         * LinkList ������ɶ��нṹ��ջ�ṹ��˫����
         */
        LinkedList<String> stack=new LinkedList<>();
        // ѹջ  LinkList���еķ���
        stack.addFirst("��1���ӵ�");// ����push()
        stack.addFirst("��2���ӵ�");
        stack.addFirst("��3���ӵ�");
        stack.addFirst("��4���ӵ�");
        System.out.println(stack);
        // ��ջ
        System.out.println(stack.removeFirst());//����pop()
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        /**
         * ����
         */
        LinkedList<String> queue=new LinkedList<>();
        // ���
        queue.addLast("1��");
        queue.addLast("2��");
        queue.addLast("3��");
        queue.addLast("4��");
        System.out.println(queue);
        //����
//        System.out.println(queue.removeLast());// �����һ��Ԫ��
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
