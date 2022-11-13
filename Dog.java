package com.duixiang.day06;

public class Dog implements Animals
{
    @Override
    public void shout() {
        System.out.println("ÍôÍô");
    }

    @Override
    public void run() {
        System.out.println("ÅÜ");
    }
}
