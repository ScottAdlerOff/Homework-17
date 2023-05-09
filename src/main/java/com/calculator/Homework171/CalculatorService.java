package com.calculator.Homework171;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CalculatorService implements CalculatorServiceIntf {

    public String greetings() {return "<b>Добро пожаловать в калькулятор</b>";}

    public int num1 (int number1){
        return number1;
    }
    public int num2 (int number2){
        return number2;
    }
    public int n1plusn2 (int i){
        return num1(i) + num2(i);
    }
}
