package com.ustc.reed.proxypattern;

public class LvShiProxy implements ZiRanRen {
    @Override
    public void quanli() {
        Reed reed = new Reed();
        reed.quanli();
    }
}
