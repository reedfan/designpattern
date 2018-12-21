package com.ustc.reed.factory.abstractfactorypattern;

public class AdvBreakfastFactory implements BreakfastFactory {
    @Override
    public Breakfast sellBuns() {
        return new ExpensiveBuns();
    }

    @Override
    public Breakfast sellSoyMilk() {
        return new ExpensiveSoyMilk();
    }
}
