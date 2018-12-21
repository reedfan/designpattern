package com.ustc.reed.factory.abstractfactorypattern;

public class BreakfastShop implements Breakfast {
    @Override
    public void sell() {
        System.out.println("卖早餐了");
    }
}
