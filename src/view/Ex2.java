package view;

import model.ex2.*;

public class Ex2 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

       System.out.println(calc.somar(1,1));
       System.out.println(calc.somar(1,1,1));
       System.out.println(calc.somar(1.0,1.0));
    }
}
