package org.iccalc.service;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdvancedCalculatorTest extends TestCase {
    private AdvancedCalculatorService advancedCalculator;

    @Before
    public void setUp() {
        advancedCalculator = new AdvancedCalculatorService();
    }

    @After
    public void tearDown() {
        advancedCalculator = null;
    }

    @Test
    public void testFactorial() throws Exception {
        long expected = 6;
        long actual = advancedCalculator.factorial(3);

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void testFactorial2() throws Exception {
        long expected = 5040;
        long actual = advancedCalculator.factorial(7);
        
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFibonacci0() throws Exception {
        long expected = 0;
        long actual = advancedCalculator.fibonacci(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFibonacci1() throws Exception {
        long expected = 1;
        long actual = advancedCalculator.fibonacci(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFibonacci2() throws Exception {
        long expected = 1;
        long actual = advancedCalculator.fibonacci(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFibonacci10() throws Exception {
        long expected = 55;
        long actual = advancedCalculator.fibonacci(10);

        Assert.assertEquals(expected, actual);
    }
}
