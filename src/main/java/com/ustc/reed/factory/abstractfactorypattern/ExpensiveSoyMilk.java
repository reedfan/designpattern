package com.ustc.reed.factory.abstractfactorypattern;

public class ExpensiveSoyMilk extends BreakfastShop {
    @Override
    public void sell() {
        System.out.println("这里的豆浆3块5起！");
    }
}
