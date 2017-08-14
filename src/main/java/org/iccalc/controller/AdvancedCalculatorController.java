package org.iccalc.controller;

import org.iccalc.external.CalculatorResult;
import org.iccalc.external.ResultStatus;
import org.iccalc.service.AdvancedCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/advancedcalc/*",
        produces = {"application/json;charset=UTF-8"})
public class AdvancedCalculatorController {

    @Autowired
    private AdvancedCalculatorService service;

    @RequestMapping(value = "/factorial/{numero}", method = RequestMethod.GET)
    public
    @ResponseBody
    CalculatorResult factorial(@PathVariable int numero) {
        CalculatorResult resultado = new CalculatorResult();

        resultado.setResultado(new Double(service.factorial(numero)));
        resultado.setMensagem("Fatorial realizado com sucesso");
        resultado.setStatus(ResultStatus.SUCCESS);

        return resultado;
    }

    @RequestMapping(value = "/fibonacci/{numero}", method = RequestMethod.GET)
    public
    @ResponseBody
    CalculatorResult fibonacci(@PathVariable int numero) {
        CalculatorResult resultado = new CalculatorResult();

        resultado.setResultado(new Double(service.fibonacci(numero)));
        resultado.setMensagem("Fibonacci realizado com sucesso");
        resultado.setStatus(ResultStatus.SUCCESS);

        return resultado;
    }

}
