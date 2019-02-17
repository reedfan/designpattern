package com.ustc.reed.singleton;

public class Singleton {
    private Singleton(){

    }
    private static volatile Singleton singleton = null;
    //双重加锁机制，并非加两个锁，而是进行两次判断
    public static Singleton getInstance(){
        //第一重判断，如果单例已经存在，不需要进行同步操作,直接返回实例
        if(singleton == null){
            //如果还不存在，进入同步块
            //同步块的目的是为了防止两个线程同步调用，生成多个实例
            synchronized (Singleton.class){
                //第二次判空的目的：当多个线程一起到达锁位置时，进行锁竞争，其中一个线程获取锁，
                // 如果是第一次进入则dl为null，会进行单例对象的创建，完成后释放锁，
                // 其他线程获取锁后就会被空判断拦截，直接返回已创建的单例对象。
                if(singleton == null){
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }
}
