package org.iccalc.controller;

import org.iccalc.external.About;
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
@RequestMapping(value = "/about/*",
        produces = {"application/json;charset=UTF-8"})
public class AboutController {
    @Autowired
    private CalculatorService service;

    @RequestMapping(value = "/system", method = RequestMethod.GET)
    public
    @ResponseBody
    About getSystemInformation(@PathVariable int parcela1, @PathVariable int parcela2) {
        About about = new About();

        about.setTitle("Continuous Integration Calculator");
        about.setUrl("https://iccalc.herokuapp.com/");
        about.setStatus("COMPLETE");
        about.setDescription("Esse projeto é uma calculadora simples, porém o principal objetivo é testar a integração contínua e entrega contínua entre github - travis - heroku.");

        return about;
    }

}
