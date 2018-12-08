package com.ustc.reed.bridgepattern.areaA;

import com.ustc.reed.bridgepattern.Bridge;

public abstract class AreaA {
    //引用桥接口
    public Bridge bridge;

    //来源地
    public abstract void fromAreaA();



}
