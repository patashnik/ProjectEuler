package ru.patashnik.projecteuler.util;

public class Divider {

    public static int count(long number) {
        int[] primes = PrimeNumber.all((int) Math.sqrt(number));
        int product = 1;
        for (int prime : primes) {
            int count = 0;
            if (prime <= 1) {
                continue;
            }
            if (prime > number) {
                break;
            }
            while (number % prime == 0) {
                count++;
                number = number / prime;
            }
            if (count > 0) {
                product *= (count + 1);
            }
        }
        return product > 1 ? product : 0;
    }
}
