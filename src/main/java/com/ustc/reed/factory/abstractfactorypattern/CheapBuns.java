package com.ustc.reed.factory.abstractfactorypattern;

public class CheapBuns extends BreakfastShop{
    @Override
    public void sell() {
        System.out.println("这里的包子统统1块5~");
    }
}
