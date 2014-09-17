package ru.patashnik.projecteuler.problems;

import java.math.BigInteger;

public class Problem16 implements Problem {
    @Override
    public int getNumber() {
        return 16;
    }

    @Override
    public String getTitle() {
        return "Power digit sum";
    }

    @Override
    public String solve() {
        long sum = 0;
        char[] digits = BigInteger.valueOf(2).pow(1000).toString().toCharArray();
        for (char digit : digits) {
            sum += digit - '0';
        }

        return String.valueOf(sum);
    }
}
