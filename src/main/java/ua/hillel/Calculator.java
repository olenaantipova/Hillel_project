package ua.hillel;

public class Calculator {
    public int addition(int a, int b) {
        return a + b;
    }
    public int addition(int a, int b, int c) {
        return a + b + c;
    }
    public double addition(double a, double b) {
        return a + b;
    }
    public double addition(double a, double b, double c) {
        return a + b + c;
    }

    public int subtraction (int a, int b) {
        return a - b;
    }
    public int subtraction (int a, int b, int c) {
        return a - b - c;
    }
    public double subtraction (double a, double b) {
        return a - b;
    }
    public double subtraction (double a, double b, double c) {
        return a - b - c;
    }

    public int multiplication (int a, int b) {
        return a * b;
    }
    public int multiplication (int a, int b, int c) {
        return a * b * c;
    }
    public double multiplication (double a, double b) {
        return a * b;
    }
    public double multiplication (double a, double b, double c) {
        return a * b * c;
    }

    public int division (int a, int b) {
        return a / b;
    }
    public int division (int a, int b, int c) {
        return a / b / c;
    }
    public double division (double a, double b) {
        return a / b;
    }
    public double division (double a, double b, double c) {
        return a / b / c;
    }
    public Double calculate(String operation, int a, int b){
        switch (operation) {
            case "+":
                return Double.valueOf(addition(a, b));
            case "-":
                return Double.valueOf(subtraction(a, b));
            case "*":
                return Double.valueOf(multiplication(a, b));
            case "/":
                return Double.valueOf(division(a, b));
            default:
                return null;
        }

    }
    public Double calculate(String operation, int a, int b, int c){
        switch (operation) {
            case "+":
                return Double.valueOf(addition(a, b, c));
            case "-":
                return Double.valueOf(subtraction(a, b, c));
            case "*":
                return Double.valueOf(multiplication(a, b, c));
            case "/":
                return Double.valueOf(division(a, b, c));
            default:
                return null;
        }

    }
    public Double calculate(String operation, double a, double b, double c){
        switch (operation) {
            case "+":
                return Double.valueOf(addition(a, b, c));
            case "-":
                return Double.valueOf(subtraction(a, b, c));
            case "*":
                return Double.valueOf(multiplication(a, b, c));
            case "/":
                return Double.valueOf(division(a, b, c));
            default:
                return null;
        }

    }
    public Double calculate(String operation, double a, double b) {
        switch (operation) {
            case "+":
                return Double.valueOf(addition(a, b));
            case "-":
                return Double.valueOf(subtraction(a, b));
            case "*":
                return Double.valueOf(multiplication(a, b));
            case "/":
                return Double.valueOf(division(a, b));
            default:
                return null;
        }
    }
}
