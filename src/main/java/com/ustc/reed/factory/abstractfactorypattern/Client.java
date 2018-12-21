package com.ustc.reed.factory.abstractfactorypattern;

public class Client {

    public static void main(String[] args) {

        BreakfastFactory breakfastFactory1 = new AdvBreakfastFactory();
        Breakfast breakfast1 = breakfastFactory1.sellBuns();
        breakfast1.sell();

        BreakfastFactory breakfastFactory2 = new LowBreakfastFactory();
        Breakfast breakfast2 = breakfastFactory2.sellSoyMilk();
        breakfast2.sell();

    }


}
