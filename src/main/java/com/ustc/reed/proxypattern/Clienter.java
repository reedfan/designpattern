package com.ustc.reed.proxypattern;

public class Clienter {
    public static void main(String[] args) {
        ZiRanRen lvShiPrpxy = new LvShiProxy();
        lvShiPrpxy.quanli();
    }


}
