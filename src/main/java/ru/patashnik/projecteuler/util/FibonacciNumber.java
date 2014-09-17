package ru.patashnik.projecteuler.util;

import java.math.BigInteger;

public class FibonacciNumber {

    private final BigInteger startValue;
    private BigInteger previous1;
    private BigInteger previous2;

    public FibonacciNumber(BigInteger startValue) {
        this.startValue = startValue;
    }

    public synchronized BigInteger next() {
        if (previous2 == null) {
            if (previous1 == null) {
                previous1 = startValue;
                return previous1;
            }
            previous2 = previous1;
            previous1 = previous1.add(BigInteger.ONE);
            return previous1;
        }
        BigInteger sum = previous1.add(previous2);
        previous2 = BigInteger.valueOf(previous1.longValue());
        previous1 = sum;
        return sum;
    }
}
