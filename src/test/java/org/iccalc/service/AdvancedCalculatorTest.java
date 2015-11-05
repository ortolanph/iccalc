package org.iccalc.service;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    }
}
