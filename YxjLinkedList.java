package com.duixiang.day22;

public class YxjLinkedList<E> {
    // �ײ��������ʵ��
    private Node<E> head;// ͷ���
    private Node<E> tail;// β���
    private int size=0;  // ������
    private static class Node<E>{
        private E item;// ��ǰ�ڵ��ֵ
        private Node<E> prev;//��һ���ڵ�
        private Node<E> next;//��һ���ڵ�

        public Node( Node<E> prev,E item, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
    public void  add(E e){
        Node l=tail; // ��ȡ��ǰ�������һ���ڵ�
        Node<E> newNode = new Node<E>(l,e,null);
        tail=newNode;
        if (l==null){
            // �������û�����һ���ڵ� ˵������Ϊ��
            head=newNode;
        }
        else {
            l.next=newNode;
        }
        size++;
    }
     public E get(int index){
        // �±����Խ�� ��Ҫ�������
        return node(index).item;
     }

     public E remove(int index){
        return unlink(node(index));
     }
    public static void main(String[] args) {
        YxjLinkedList<String> yxjLinkedList = new YxjLinkedList<>();
        yxjLinkedList.add("Yxj001");
        yxjLinkedList.add("Yxj002");
        yxjLinkedList.add("Yxj003");
        System.out.println("����ִ����ϣ�");
        yxjLinkedList.remove(1);
        System.out.println(yxjLinkedList.get(1));
    }



     Node<E> node(int index){
        if (index<size>>1){
            // ��ѯ�����м�ֵ����� index
            Node<E> h=head;
            for (int i = 0; i < index; i++) {
                h=h.next;
            }
            return h;
        }
        else {
            // ��ѯ�����м�ֵ���ұ�
            Node<E> t=tail;
            for (int i = size-1; i > index; i--) {
                t=t.prev;
            }
            return t;
        }


     }

     private E unlink(Node<E> node){
        /*
        1. ����index ��ѯ��Ӧ��node�ڵ� ʱ�临�Ӷ��Ѿ���O(n)
        2. ɾ�������ѯЧ��ȷʵ�ǳ��� ��arraylistЧ�ʸ�
        ��ȡɾ����node�ڵ� ��һ������һ���ڵ�
         */
         final E element= node.item;// ��ȡҪɾ���Ľڵ�Ԫ��
         Node<E> prev=node.prev; // ɾ���ڵ����һ���ڵ�
         Node<E> next=node.next; //ɾ���ڵ����һ���ڵ�
         if (prev==null){// ˵����ǰ�ڵ���ͷ���
             head=next; // ����һ���ڵ���ͷ�ڵ�
         }else {
             // ɾ���ڵ���һ���ڵ�.next�ڵ�=ɾ���ڵ����һ���ڵ�
             prev.next=next;
             next.prev=null;
         }
         if (next==null){ // ˵��ɾ���Ľڵ�Ϊβ���
             tail=prev;
         }
         else {
             // ���ɾ���Ĳ���β��㣬��ɾ������һ���ڵ�.��һ���ڵ�ĳ�=ɾ�� ����һ���ڵ�
             next.prev=prev;
             node.next=null; //gc ����
         }
         node.item=null;
         size--;
         return element;
     }
}
