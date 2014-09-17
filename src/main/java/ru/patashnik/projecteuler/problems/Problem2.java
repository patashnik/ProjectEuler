package ru.patashnik.projecteuler.problems;

import ru.patashnik.projecteuler.util.FibonacciNumber;

import java.math.BigInteger;

public class Problem2 implements Problem {

    @Override
    public int getNumber() {
        return 2;
    }

    @Override
    public String getTitle() {
        return "Even Fibonacci numbers";
    }

    @Override
    public String solve() {
        FibonacciNumber fb = new FibonacciNumber(BigInteger.ONE);
        BigInteger next = fb.next();
        long sum = 0;
        while (next.longValue() < 4000000L) {
            next = fb.next();
            if (next.longValue() % 2 == 0) {
                sum += next.longValue();
            }
        }
        return Long.toString(sum);
    }
}
