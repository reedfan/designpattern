package com.ustc.reed.proxypattern.jdkproxy;

public class Main {

    public static void main(String[] args) {
        People me = new Me("reed","jay演唱会门票");

        People instance = (People)new HuangNiu().getInstance(me);

        instance.speak();

        System.out.println("生成代理对象后变成："+instance.getClass());


    }


}
