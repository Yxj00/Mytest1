package com.duixiang.day21;

/**
 * ��������
 * @param <E>
 */
public class Node<E> {
    /*
    node�ڵ�Ԫ�ص�ֵ
     */
    private E v;
    /*
    ��ǰ�ڵ�ָ����һ���ڵ�
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
        node1.next=node3;//ɾ��node2
        showNode(node1);
    }

    /**
     * ���ݸ�������ͷ������β
     * @param node
     */
    static void showNode(Node<?> node){//?��ͨ���
        // ��ǰnode�ڵ� �Ǵ�ͷ�ڵ㿪ʼ��
        Node<?> cuNode=node;
        while(cuNode!=null){
            System.out.print(cuNode.v+" ");
            //��ǰnode�ڵ����һ���ڵ㸳ֵ��cuNode
            cuNode=cuNode.next;
        }
        System.out.println();
    }

    /**
     * �������ݽṹ�������
     * ֻ��Ҫ�ҵ��������һ���ڵ� .next==�����ڵ�
     * �������ݽṹ ���ÿ����� ���������� ֻҪ�ڴ��㹻�Ϳ���
     * ������β����tailNode,�ڽ��½ڵ����
     */
    static void addNode(Node<String> tailNode,Node<String> newNode){
        tailNode.next=newNode;

    }
}
