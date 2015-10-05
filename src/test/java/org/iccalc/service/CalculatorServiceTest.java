package org.iccalc.service;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorServiceTest extends TestCase {

    private CalculatorService service;

    public void setUp() throws Exception {
        service = new CalculatorService();
    }

    public void tearDown() throws Exception {
        service = null;
    }

    public void testAdicao() throws Exception {
        int expected = 2;
        int actual = service.adicao(1, 1);

        assertEquals(expected, actual);
    }

    public void testSubtracao() throws Exception {
        int expected = 0;
        int actual = service.subtracao(1, 1);

        assertEquals(expected, actual);
    }

    public void testMultiplicacao() throws Exception {
        long expected = 4;
        long actual = service.multiplicacao(2, 2);

        assertEquals(expected, actual);
    }

    public void testDivisao() throws Exception {
        double expected = 2;
        double actual = service.divisao(10, 5);

        assertEquals(expected, actual, 0d);
    }
}