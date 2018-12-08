package com.ustc.reed.bridgepattern;

import com.ustc.reed.bridgepattern.areaA.AreaA;
import com.ustc.reed.bridgepattern.areaA.AreaA2;
import com.ustc.reed.bridgepattern.areaB.AreaB3;

public class Clienter {
    public static void main(String[] args) {
        AreaA a = new AreaA2();
        a.bridge = new AreaB3();
        a.fromAreaA();
        a.bridge.targetAreaB();
    }




}
