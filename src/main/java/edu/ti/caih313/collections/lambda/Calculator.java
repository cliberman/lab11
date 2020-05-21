package edu.ti.caih313.collections.lambda;

import java.lang.Math;

public class Calculator {
    public static void main(String... args) {

        Calculator myApp = new Calculator();
        //Integer operations:
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath multiplication = (a, b) -> a * b;
        IntegerMath division = (a, b) -> a/b;
        System.out.println("Integer operations:");
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));
        System.out.println("20 * 10 = " +
                myApp.operateBinary(20, 10, multiplication));
        System.out.println("20/10 = " +
                myApp.operateBinary(20, 10, division));

        //double operations:
        DoubleMath doubleAddition = (a, b) -> a + b;
        DoubleMath doubleSubtraction = (a, b) -> a - b;
        DoubleMath doubleMultiplication = (a, b) -> a * b;
        DoubleMath doubleDivision = (a, b) -> a/b;
        System.out.println(" \n Double operations:");
        System.out.println("40 + 2 = " +
                myApp.operateBinaryDouble(40.5, 2.5, doubleAddition));
        System.out.println("20 - 10 = " +
                myApp.operateBinaryDouble(20.0, 10.0, doubleSubtraction));
        System.out.println("20 * 10 = " +
                myApp.operateBinaryDouble(20.0, 10.0, doubleMultiplication));
        System.out.println("20/10 = " +
                myApp.operateBinaryDouble(20.0, 10.0, doubleDivision));

        //Unary operations:
        UnaryMath unaryAbsoluteValue = (a) -> Math.abs(a);
        UnaryMath unaryInverse = (a) -> 1/a;
        System.out.println(" \n Unary operations:");
        System.out.println("Absolute value of -40 = " +
                myApp.operateBinaryUnary(-40.0, unaryAbsoluteValue));
        System.out.println("Inverse of 40 = " +
                myApp.operateBinaryUnary(40.0, unaryInverse));
    }

    private int operateBinary(int a, int b, IntegerMath integerMath) {
        return integerMath.operation(a, b);
    }

    private double operateBinaryDouble(double a, double b, DoubleMath doubleMath) {
        return doubleMath.operation(a, b);
    }

    private double operateBinaryUnary(double a, UnaryMath unaryMath) {
        return unaryMath.operation(a);
    }
}


