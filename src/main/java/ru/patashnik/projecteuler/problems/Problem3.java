package ru.patashnik.projecteuler.problems;

import ru.patashnik.projecteuler.util.PrimeNumber;

import java.math.BigInteger;

public class Problem3 implements Problem {
    @Override
    public int getNumber() {
        return 3;
    }

    @Override
    public String getTitle() {
        return "Largest prime factor";
    }

    @Override
    public String solve() {
        long value = 600851475143L;
        long half = value / 2;

        PrimeNumber primeNumber = new PrimeNumber();
        BigInteger lastPrime = primeNumber.next();
        BigInteger maxPrime = BigInteger.ONE;

        while (lastPrime.longValue() * lastPrime.longValue() < half) {
            if (value % lastPrime.longValue() == 0) {
                maxPrime = lastPrime;
            }
            lastPrime = primeNumber.next();
        }

        return maxPrime.toString();
    }
}
