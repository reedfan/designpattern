package com.ustc.reed.factory.simplefactortypattern;

public abstract class Enemy {
    //敌人的坐标，会被继承
    int x;
    int y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //抽象方法，地图上绘制
    public abstract void show();

}
