package com.collectionframe.march19th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 斗地主游戏
 * 1.做牌      静态代码块
 * 2. 洗牌
 * 3. 定义三个玩家
 * 4。发牌
 * 5.排序（拓展 了解 作业）
 * 6.看牌
 */
public class GameDemo {
    /**
     * 1.定义一个静态的集合存储54张牌
     */
    public static List<Card> allCards=new ArrayList<>();

    /**
     *2.做牌 定义静态代码块初始化数据
     */
    static {
        //3.定义点数，个数确定，类型确定，使用数组
        String[] sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //4. 定义花色
        String[] colors={ "红桃", "黑桃", "方块", "梅花" };
        //5.组合点数和花色
        int index=0; // 记录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                // 6.封装成一个对象
                Card c = new Card(color, size,index);
                // 7.存入到集合容器中去
                allCards.add(c);
            }
        }
        // 8.大小王存入到集合对象中去 "?", "?"
        Card c1 = new Card("", "大王",++index);
        Card c2 = new Card("", "小王",++index);
        Collections.addAll(allCards,c1,c2);
        System.out.println("新牌"+allCards);
    }
    public static void main(String[] args) {
        // 9.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后"+allCards);
        // 10.发牌（定义三个玩家，每个玩家的牌也是一个集合容器）
        List<Card> 令狐冲=new ArrayList<>();
        List<Card> 鸠摩智=new ArrayList<>();
        List<Card> 任盈盈=new ArrayList<>();
        // 11.开始发牌  从集合中发出51张牌给三个玩家 剩余三张作为底牌
        for (int i = 0; i < allCards.size()-3; i++) {
            // 先拿到当前牌对象
            Card c=allCards.get(i);
            if (i%3==0){
                // 令狐冲接牌
                令狐冲.add(c);
            }else if (i%3==1){
                鸠摩智.add(c);
            }
             else if (i%3==2){
                任盈盈.add(c);
            }
        }
        // 12.拿到最后三张底牌（把最后三张底牌截取成一个子集合）
        List<Card> lastThreeCards=allCards.subList(allCards.size()-3,allCards.size());
        // 13.给玩家的牌排序(从大到小  )
       sortCard(令狐冲);
       sortCard(鸠摩智);
       sortCard(任盈盈);
        // 14 输出玩家的牌
        System.out.println("令狐冲:"+令狐冲);
        System.out.println("鸠摩智:"+鸠摩智);
        System.out.println("任盈盈:"+任盈盈);
        System.out.println("三张底牌:"+lastThreeCards);
    }

    /**
     * 给牌排序
     * @param cards
     */
    private static void sortCard(List<Card> cards) {
        Collections.sort(cards,(o1,o2)->o2.getIndex()-o1.getIndex());// 降序
    }
}
