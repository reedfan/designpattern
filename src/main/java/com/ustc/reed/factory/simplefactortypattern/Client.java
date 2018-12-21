package com.ustc.reed.factory.simplefactortypattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("游戏开始");
        SimpleFactory factory = new SimpleFactory(100);
        factory.create("AirPlane").show();
        factory.create("Tank").show();
    }

}
