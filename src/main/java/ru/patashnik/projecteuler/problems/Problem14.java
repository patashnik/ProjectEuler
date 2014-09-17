package ru.patashnik.projecteuler.problems;

public class Problem14 implements Problem {
    @Override
    public int getNumber() {
        return 14;
    }

    @Override
    public String getTitle() {
        return "Longest Collatz sequence";
    }

    @Override
    public String solve() {
        long maxNumber = 0;
        int maxChain = 0;
        long startNumber = 1;

        while (startNumber <= 1000000) {
            long start = startNumber;
            int chain = 1;
            while ((start / 2) != 1) {
                if ((start % 2) == 0) {
                    start = start / 2;
                } else {
                    start = 3 * start + 1;
                }
                ++chain;
            }
            if (chain > maxChain) {
                maxChain = chain;
                maxNumber = startNumber;
            }
            ++startNumber;
        }

        return Long.toString(maxNumber);
    }
}
