package com.ustc.reed.factory.factorypattern;

public class Client {

    public static void main(String[] args) {
        int screenWidth = 100;
        System.out.println("游戏开始");
        Factory factory = new RandomFactory();
        for (int i = 0; i < 10; i++) {
            factory.create(screenWidth).show();

        }
        System.out.println("抵达关底");
        factory = new BossFactory();
        factory.create(screenWidth).show();

    }





}
