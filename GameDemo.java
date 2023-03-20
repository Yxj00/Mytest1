package com.collectionframe.march19th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ��������Ϸ
 * 1.����      ��̬�����
 * 2. ϴ��
 * 3. �����������
 * 4������
 * 5.������չ �˽� ��ҵ��
 * 6.����
 */
public class GameDemo {
    /**
     * 1.����һ����̬�ļ��ϴ洢54����
     */
    public static List<Card> allCards=new ArrayList<>();

    /**
     *2.���� ���徲̬������ʼ������
     */
    static {
        //3.�������������ȷ��������ȷ����ʹ������
        String[] sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //4. ���廨ɫ
        String[] colors={ "����", "����", "����", "÷��" };
        //5.��ϵ����ͻ�ɫ
        int index=0; // ��¼�ƵĴ�С
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                // 6.��װ��һ������
                Card c = new Card(color, size,index);
                // 7.���뵽����������ȥ
                allCards.add(c);
            }
        }
        // 8.��С�����뵽���϶�����ȥ "?", "?"
        Card c1 = new Card("", "����",++index);
        Card c2 = new Card("", "С��",++index);
        Collections.addAll(allCards,c1,c2);
        System.out.println("����"+allCards);
    }
    public static void main(String[] args) {
        // 9.ϴ��
        Collections.shuffle(allCards);
        System.out.println("ϴ�ƺ�"+allCards);
        // 10.���ƣ�����������ң�ÿ����ҵ���Ҳ��һ������������
        List<Card> �����=new ArrayList<>();
        List<Card> �Ħ��=new ArrayList<>();
        List<Card> ��ӯӯ=new ArrayList<>();
        // 11.��ʼ����  �Ӽ����з���51���Ƹ�������� ʣ��������Ϊ����
        for (int i = 0; i < allCards.size()-3; i++) {
            // ���õ���ǰ�ƶ���
            Card c=allCards.get(i);
            if (i%3==0){
                // ��������
                �����.add(c);
            }else if (i%3==1){
                �Ħ��.add(c);
            }
             else if (i%3==2){
                ��ӯӯ.add(c);
            }
        }
        // 12.�õ�������ŵ��ƣ���������ŵ��ƽ�ȡ��һ���Ӽ��ϣ�
        List<Card> lastThreeCards=allCards.subList(allCards.size()-3,allCards.size());
        // 13.����ҵ�������(�Ӵ�С  )
       sortCard(�����);
       sortCard(�Ħ��);
       sortCard(��ӯӯ);
        // 14 �����ҵ���
        System.out.println("�����:"+�����);
        System.out.println("�Ħ��:"+�Ħ��);
        System.out.println("��ӯӯ:"+��ӯӯ);
        System.out.println("���ŵ���:"+lastThreeCards);
    }

    /**
     * ��������
     * @param cards
     */
    private static void sortCard(List<Card> cards) {
        Collections.sort(cards,(o1,o2)->o2.getIndex()-o1.getIndex());// ����
    }
}
