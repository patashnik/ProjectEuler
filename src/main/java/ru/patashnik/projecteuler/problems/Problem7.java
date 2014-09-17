package ru.patashnik.projecteuler.problems;

import ru.patashnik.projecteuler.util.PrimeNumber;

public class Problem7 implements Problem {
    @Override
    public int getNumber() {
        return 7;
    }

    @Override
    public String getTitle() {
        return "10001st prime";
    }

    @Override
    public String solve() {
        PrimeNumber primeNumber = new PrimeNumber();
        long prime = 0;
        int count = 0;
        while (count != 10001) {
            prime = primeNumber.next().longValue();
            if (prime >= 2) {
                count++;
            }
        }

        return Long.toString(prime);
    }
}
