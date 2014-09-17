package ru.patashnik.projecteuler.util;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PrimeNumber {

    private SortedSet<BigInteger> primes = new TreeSet<>();

    public static int[] all(int max) {
        if (max > (Integer.MAX_VALUE - 5)) {
            throw new IllegalArgumentException();
        }

        boolean[] sieve = new boolean[max+1];
        Arrays.fill(sieve, true);
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                for (int j = 2; i*j < sieve.length; j++) {
                    sieve[i*j] = false;
                }
            }
        }
        int[] primes = new int[max];
        int size = 0;
        for (int i = 1; i < sieve.length; i++) {
            if (sieve[i]) {
                primes[size++] = i;
            }
        }
        return Arrays.copyOf(primes, size);// cleanup from zero's
    }

    public BigInteger next() {
        if (primes.size() == 0) {
            primes.add(BigInteger.ONE);
            return primes.last();
        }

        boolean isPrime = false;
        BigInteger next;
        next = primes.last();

        do {
            next = next.add(BigInteger.ONE);
            if (next.longValue() % 2 == 0) {
                continue;
            }
            for (BigInteger prime : primes) {
                if (prime.longValue() > 1
                        && next.longValue() > 1
                        && (next.longValue() % prime.longValue() == 0)) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                primes.add(next);
            }
        } while (!isPrime);

        return next;
    }
}
