package com.duixiang.day21;

/**
 * 单向链表
 * @param <E>
 */
public class Node<E> {
    /*
    node节点元素的值
     */
    private E v;
    /*
    当前节点指向下一个节点
     */
    Node<E> next;

    public static void main(String[] args) {
        Node<String> node3 = new Node<>();
        node3.v = "c";
        Node<String> node2 = new Node<>();
        node2.v = "b";
        Node<String> node1 = new Node<>();
        node1.v = "a";
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        System.out.println(node1);
        showNode(node1);
        Node<String> node4 = new Node<>();
        node4.v="d";
        addNode(node3, node4);
        node1.next=node3;//删除node2
        showNode(node1);
    }

    /**
     * 根据该链表，从头遍历到尾
     * @param node
     */
    static void showNode(Node<?> node){//?是通配符
        // 当前node节点 是从头节点开始的
        Node<?> cuNode=node;
        while(cuNode!=null){
            System.out.print(cuNode.v+" ");
            //当前node节点的下一个节点赋值给cuNode
            cuNode=cuNode.next;
        }
        System.out.println();
    }

    /**
     * 链表数据结构如何新增
     * 只需要找到链表最后一个节点 .next==新增节点
     * 链表数据结构 不用考虑她 的扩容问题 只要内存足够就可以
     * 将链表尾结点给tailNode,在将新节点给他
     */
    static void addNode(Node<String> tailNode,Node<String> newNode){
        tailNode.next=newNode;

    }
}
