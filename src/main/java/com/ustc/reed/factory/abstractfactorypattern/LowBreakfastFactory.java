package com.ustc.reed.factory.abstractfactorypattern;

public class LowBreakfastFactory implements BreakfastFactory {
    @Override
    public Breakfast sellBuns() {
        return new CheapBuns();
    }

    @Override
    public Breakfast sellSoyMilk() {
        return new CheapSoyMilk();
    }
}
