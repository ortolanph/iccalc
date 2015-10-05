package org.iccalc.controller;

import org.iccalc.external.CalculatorResult;
import org.iccalc.external.ResultStatus;
import org.iccalc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/calc/*",
        produces = {"application/json;charset=UTF-8"})
public class CalculatorController {
    @Autowired
    private CalculatorService service;

    @RequestMapping(value = "/adicao", method = RequestMethod.GET)
    public
    @ResponseBody
    CalculatorResult adicao(@PathVariable int parcela1, @PathVariable int parcela2) {
        CalculatorResult resultado = new CalculatorResult();

        resultado.setResultado(new Double(service.adicao(parcela1, parcela2)));
        resultado.setMensagem("Soma realizada com sucesso");
        resultado.setStatus(ResultStatus.SUCCESS);

        return resultado;
    }

    @RequestMapping(value = "/subtracao", method = RequestMethod.GET)
    public
    @ResponseBody
    CalculatorResult subtracao(@PathVariable int parcela1, @PathVariable int parcela2) {
        CalculatorResult resultado = new CalculatorResult();

        resultado.setResultado(new Double(service.subtracao(parcela1, parcela2)));
        resultado.setMensagem("Subtracao realizada com sucesso");
        resultado.setStatus(ResultStatus.SUCCESS);

        return resultado;
    }

    @RequestMapping(value = "/multiplicacao", method = RequestMethod.GET)
    public
    @ResponseBody
    CalculatorResult multiplicacao(@PathVariable long fator1, @PathVariable long fator2) {
        CalculatorResult resultado = new CalculatorResult();

        resultado.setResultado(new Double(service.multiplicacao(fator1, fator2)));
        resultado.setMensagem("Multiplicacao realizada com sucesso");
        resultado.setStatus(ResultStatus.SUCCESS);

        return resultado;
    }

    @RequestMapping(value = "/divisao", method = RequestMethod.GET)
    public
    @ResponseBody
    CalculatorResult divisao(@PathVariable int divisor, @PathVariable int dividendo) {
        CalculatorResult resultado = new CalculatorResult();

        try {
            resultado.setResultado(new Double(service.divisao(dividendo, divisor)));
            resultado.setMensagem("Divisão realizada com sucesso");
            resultado.setStatus(ResultStatus.SUCCESS);
        } catch(Exception e) {
            resultado.setMensagem(e.getMessage());
            resultado.setStatus(ResultStatus.FAIL);
        }

        return resultado;
    }

}
