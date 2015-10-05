package org.iccalc.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int adicao(int parcela1, int parcela2) { return (parcela1 + parcela2); }

    public int subtracao(int parcela1, int parcela2) { return (parcela1 - parcela2); }

    public long multiplicacao(long fator1, long fator2) { return (fator1 * fator2);  }

    public double divisao(int dividendo, int divisor) { return (dividendo / divisor); }
}
