package org.iccalc.service;

public class AdvancedCalculator {

    public long factorial(int i) {
        return (i == 0)? 1 : i * factorial(i - 1);
    }
}
