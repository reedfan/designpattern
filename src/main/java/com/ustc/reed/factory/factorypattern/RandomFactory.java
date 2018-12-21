package com.ustc.reed.factory.factorypattern;

import java.util.Random;

public class RandomFactory implements Factory {
    private Random random = new Random();

    @Override
    public Enemy create(int screenWidth) {
        Enemy enemy = null;
        if(random.nextBoolean()){
            enemy = new AirPlane(random.nextInt(screenWidth),0); //实例飞机
        }else {
            enemy = new Tank(random.nextInt(screenWidth),0);
        }
        return enemy;
    }
}
