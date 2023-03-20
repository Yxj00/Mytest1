package com.collectionframe.march19th;

public class Card {
    private String size;
    private String color;
    private int index;// 牌的真正的大小

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index=index;
    }

    public Card() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size+color;// 直接看点数和花色
    }
}