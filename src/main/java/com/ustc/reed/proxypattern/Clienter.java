package com.ustc.reed.proxypattern;

public class Clienter {
    public static void main(String[] args) {
        ZiRanRen lvShiPrpxy = new LvShiProxy();
        lvShiPrpxy.quanli(); //我赋予我的代理律师来行使这些权利,此时代理律师全权代理我处理某些事务
    }
}
