package com.calculator.Homework171;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServiceIntf calculatorServiceIntf;

    public CalculatorController(CalculatorServiceIntf calculatorServiceIntf) {
        this.calculatorServiceIntf = calculatorServiceIntf;
    }

    @GetMapping(path = "/calculator")
    public String greetings() {
        return calculatorServiceIntf.greetings();
    }

    public int num1(@RequestParam("num1") int number1) {
        return calculatorServiceIntf.num1(number1);
    }

    public int num2(@RequestParam("num2") int number2) {
        return calculatorServiceIntf.num1(number2);
    }

    @GetMapping(path = "/calculator/plus")
    public int n1plusn2() {
        return calculatorServiceIntf.n1plusn2(5);
    }
}