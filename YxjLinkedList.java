package com.duixiang.day22;

public class YxjLinkedList<E> {
    // 底层基于链表实现
    private Node<E> head;// 头结点
    private Node<E> tail;// 尾结点
    private int size=0;  // 链表长度
    private static class Node<E>{
        private E item;// 当前节点的值
        private Node<E> prev;//上一个节点
        private Node<E> next;//下一个节点

        public Node( Node<E> prev,E item, Node<E> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
    public void  add(E e){
        Node l=tail; // 获取当前链表最后一个节点
        Node<E> newNode = new Node<E>(l,e,null);
        tail=newNode;
        if (l==null){
            // 如果链表没有最后一个节点 说明链表为空
            head=newNode;
        }
        else {
            l.next=newNode;
        }
        size++;
    }
     public E get(int index){
        // 下标如果越界 需要报错处理的
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
        System.out.println("链表执行完毕！");
        yxjLinkedList.remove(1);
        System.out.println(yxjLinkedList.get(1));
    }



     Node<E> node(int index){
        if (index<size>>1){
            // 查询链表中间值的左边 index
            Node<E> h=head;
            for (int i = 0; i < index; i++) {
                h=h.next;
            }
            return h;
        }
        else {
            // 查询链表中间值的右边
            Node<E> t=tail;
            for (int i = size-1; i > index; i--) {
                t=t.prev;
            }
            return t;
        }


     }

     private E unlink(Node<E> node){
        /*
        1. 根据index 查询对应的node节点 时间复杂度已经是O(n)
        2. 删除链表查询效率确实非常高 比arraylist效率高
        获取删除的node节点 上一个和下一个节点
         */
         final E element= node.item;// 获取要删除的节点元素
         Node<E> prev=node.prev; // 删除节点的上一个节点
         Node<E> next=node.next; //删除节点的下一个节点
         if (prev==null){// 说明当前节点是头结点
             head=next; // 将下一个节点变成头节点
         }else {
             // 删除节点上一个节点.next节点=删除节点的下一个节点
             prev.next=next;
             next.prev=null;
         }
         if (next==null){ // 说明删除的节点为尾结点
             tail=prev;
         }
         else {
             // 如果删除的不是尾结点，则删除的下一个节点.上一个节点改成=删除 的上一个节点
             next.prev=prev;
             node.next=null; //gc 回收
         }
         node.item=null;
         size--;
         return element;
     }
}
