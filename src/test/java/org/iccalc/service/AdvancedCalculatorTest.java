package org.iccalc.service;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

public class AdvancedCalculatorTest extends TestCase {
    private AdvancedCalculator advancedCalculator;

    @Before
    public void setUp() {
        advancedCalculator = new AdvancedCalculator();
    }

    @After
    public void tearDown() {
        advancedCalculator = null;
    }

    @public void testFactorial() {
        long expected = 6;
        long actual = advancedCalculator.factorial(3);

        Assert.assertEquals(expected, actual);
    }
}