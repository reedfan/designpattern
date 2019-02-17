package com.ustc.reed.proxypattern.jdkproxy;

public class Me implements People {

    private String name;
    private String type;

    public Me(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void speak() {
        System.out.println("I am"+name+"   ,i need a"+type);

    }
}
