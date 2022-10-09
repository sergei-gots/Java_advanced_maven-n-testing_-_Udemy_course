package org.udemy.java_advanced;

public class MyMath {

    public static int divide(int divisible, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Can't divide by zero");
        }
        return divisible/divisor;
    }
}
