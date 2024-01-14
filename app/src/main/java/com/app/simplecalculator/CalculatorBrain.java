package com.app.simplecalculator;

import java.util.ArrayList;

public class CalculatorBrain {

    ArrayList<String> a = new ArrayList<>();

    public void push(String s){
        a.add(s);
    }

    public int calculate(){
        int res = 0;
        int op1 = Integer.parseInt(a.get(0));
        int op2 = Integer.parseInt(a.get(2));
        String operator = a.get(1);
        if(operator == "+"){
            res = op1+op2;
        }
        else if(operator == "-"){
            res = op1-op2;
        }
        else if(operator == "*"){
            res = op1*op2;
        }
        else if(operator == "/"){
            res = op1/op2;
        }
        return res;
    }

}
