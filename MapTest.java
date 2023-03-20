package com.collectionframe.march20thMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * ����ͳ��ͶƱ����
 */
public class MapTest {
    public static void main(String[] args) {
        // 1.��80��ѧ��ѡ��������ý���
        String[] selects = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();// ƴ���ַ���
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);
        // 2.����һ��Map���ϼ�¼����ͳ�ƵĽ��:��  A=30 B=20 C=20 D=10
        Map<Character,Integer> infos=new HashMap<>();
        // 3.����80��ѧ��ѡ�������
        for (int i = 0; i < sb.length(); i++) {
            // 4.��ȡ��ǰ�ַ�
            char ch= sb.charAt(i);
            // 5.�ж�Map�����Ƿ���������
            if (infos.containsKey(ch)){
                // �����1
                infos.put(ch,infos.get(ch)+1);
            }else {
                // ˵���˾����ǵ�һ�α�ѡ
                infos.put(ch,1);
            }
        }
        // 4.�������
        System.out.println(infos);
    }
}