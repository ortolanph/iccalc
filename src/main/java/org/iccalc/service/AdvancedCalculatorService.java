package org.iccalc.service;

import org.springframework.stereotype.Service;

@Service
public class AdvancedCalculatorService {

    public long factorial(int i) {
        return (i == 0)? 1 : i * factorial(i - 1);
    }

    public long fibonacci(int i) {
        return (i < 2)? i : fibonacci(i - 1) + fibonacci(i - 2);
    }
}
