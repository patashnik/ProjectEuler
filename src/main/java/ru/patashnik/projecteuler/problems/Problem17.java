package ru.patashnik.projecteuler.problems;

public class Problem17 implements Problem {
    @Override
    public int getNumber() {
        return 17;
    }

    @Override
    public String getTitle() {
        return "Number letter counts";
    }

    @Override
    public String solve() {
        long length = 0;

        length =
            // 1, 21, 31, ... , 91, 101, ... , 201, ... , 991
            "one".length() * (9 * 9) +
            "two".length() * (9 * 9) +
            "three".length() * (9 * 9) +
            "four".length() * (9 * 9) +
            "five".length() * (9 * 9)
        ;

        return null;
    }
}
