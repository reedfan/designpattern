package com.ustc.reed.adapter;

import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Iterator;
/*
 对象的适配器模式
 Enumeration since JDK1.0
 Iterator since JDK1.2
 假如现在是JDK1.0,但是想用Iterator，可以定义一个适配器EnumerationIterator来进行中转
 适配器EnumerationIterator

 */

public class EnumerationIterator implements Iterator<Object> {

    private Enumeration enumeration;
    //InputStreamReader

    public EnumerationIterator(Enumeration enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
