package com.ustc.reed.proxypattern;

public class Reed implements ZiRanRen {
    public void eat(){
        System.out.println("今天吃满汉全席");
    }

    public void drink(){
        System.out.println("今天喝酸奶");
    }

    public void quanli() {
        System.out.println("我赋予我的代理律师来行使这些权利,此时代理律师全权代理我处理某些事务");
    }
}
