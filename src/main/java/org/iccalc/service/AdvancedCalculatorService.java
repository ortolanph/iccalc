package org.iccalc.service;

import org.springframework.stereotype.Service;

@Service
public class AdvancedCalculatorService {

    public long factorial(int i) {
        return (i == 0)? 1 : i * factorial(i - 1);
    }

}
