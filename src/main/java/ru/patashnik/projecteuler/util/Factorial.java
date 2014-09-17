package ru.patashnik.projecteuler.util;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger fact(int number) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= number; ++i) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
