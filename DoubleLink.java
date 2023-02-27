package com.duixiang.day21;



/**
 * 双向链表
 * @param <E>
 */
public class DoubleLink<E>{
    /*
    当前节点
     */
    private E v;
    /*
    下一个节点
     */
    DoubleLink<E> next;
    /*
    上一个节点
     */
    DoubleLink<E> previous;

    public static void main(String[] args) {
        DoubleLink<String> node1 = new DoubleLink<>();
        DoubleLink<String> node2 = new DoubleLink<>();
        DoubleLink<String> node3 = new DoubleLink<>();
        DoubleLink<String> node4 = new DoubleLink<>();
        node1.v="a";
        node2.v="b";
        node3.v="c";
        node4.v="d";
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node2.previous=node1;
        node3.previous=node2;
        node4.previous=node3;
        leftShow(node1);
        rightNode(node4);
    }
    static void leftShow(DoubleLink<?> node){
//        DoubleLink<?> cuNode=node;
//        while (cuNode!=null){
//            System.out.println(cuNode.v);
//            cuNode=cuNode.next;
//        }
        while (node!=null){
            System.out.print(node.v);
            node=node.next;
        }
        System.out.println();
    }
    static void rightNode(DoubleLink<?> node){
        while (node!=null){
            System.out.print(node.v);
            node=node.previous;
        }
        System.out.println();
    }
}
