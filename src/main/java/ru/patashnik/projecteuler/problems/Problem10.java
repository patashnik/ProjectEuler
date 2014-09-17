package ru.patashnik.projecteuler.problems;

import ru.patashnik.projecteuler.util.PrimeNumber;

public class Problem10 implements Problem {
    @Override
    public int getNumber() {
        return 10;
    }

    @Override
    public String getTitle() {
        return "Summation of primes";
    }

    @Override
    public String solve() {
        long sum = -1;
        int[] primes = PrimeNumber.all(2000000);
        for (int prime : primes) {
            sum += prime;
        }
        return Long.toString(sum);
    }
}
