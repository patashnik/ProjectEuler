package ru.patashnik.projecteuler.problems;

public class Problem1 implements Problem {

    private static final int[] MULTIPLES = {3, 5};

    @Override
    public int getNumber() {
        return 1;
    }

    @Override
    public String getTitle() {
        return "Multiples of 3 and 5";
    }

    @Override
    public String solve() {
        long startValue = 1L;
        long endValue = 1000L;
        long sum = 0;

        for (; startValue < endValue; startValue++) {
            for (int multiply : MULTIPLES) {
                if (startValue % multiply == 0) {
                    sum += startValue;
                    break;
                }
           }
        }

        return Long.toString(sum);
    }
}
