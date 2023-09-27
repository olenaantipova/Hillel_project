package ua.hillel;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("+", 3, 3));
        System.out.println(calc.calculate("-", 3, 3));
        System.out.println(calc.calculate("*", 3, 3));
        System.out.println(calc.calculate("/", 3, 3));


    }
}

